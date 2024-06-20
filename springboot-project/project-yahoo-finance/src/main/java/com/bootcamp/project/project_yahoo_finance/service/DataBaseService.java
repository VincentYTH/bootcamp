package com.bootcamp.project.project_yahoo_finance.service;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.bootcamp.project.project_yahoo_finance.entity.StockEntity;
import com.bootcamp.project.project_yahoo_finance.entity.StocksListEntity;
import com.bootcamp.project.project_yahoo_finance.infra.RedisHelper;
import com.bootcamp.project.project_yahoo_finance.mapper.StockMapper;
import com.bootcamp.project.project_yahoo_finance.model.YahooFinanceResponse;
import com.bootcamp.project.project_yahoo_finance.repository.StockRepository;
import com.bootcamp.project.project_yahoo_finance.repository.StocksListRepository;

@Service
public class DataBaseService {
  @Autowired
  private RestTemplate restTemplate;

  @Autowired
  private StockRepository stockRepository;

  @Autowired
  private StocksListRepository stocksListRepository;

  @Autowired
  private StockMapper stockMapper;

  @Autowired
  private RedisHelper redisHelper;

  @Value(value = "${api.yahoo-finance.domain}")
  private String domain;

  @Value(value = "${api.yahoo-finance.cookie}")
  private String cookie;

  public void initialize(){
    initializeStocksList();
    clearRedis();
  }

  private void initializeStocksList() {
    List<StocksListEntity> stocksList =
        Arrays.asList(StocksListEntity.builder().symbol("0388.HK").build(),
            StocksListEntity.builder().symbol("0700.HK").build(),
            StocksListEntity.builder().symbol("0005.HK").build());
    stocksListRepository.saveAll(stocksList);
  }

  public void clearRedis() {
    redisHelper.deleteAll();
  }

  public void fetchAndSaveStockData() {
    List<StocksListEntity> stocksList = stocksListRepository.findAll();
    for (StocksListEntity stock : stocksList) {
      YahooFinanceResponse response =
          callApiWithCookie(buildApiUrl(stock.getSymbol()));
      StockEntity stockEntity = stockMapper.mapToStockEntity(response);
      stockRepository.save(stockEntity);
    }
  }

  private String buildApiUrl(String symbol) {
    return UriComponentsBuilder.newInstance().scheme("https").host(domain)
        .path("/v7/finance/quote").queryParam("symbols", symbol)
        .queryParam("crumb", "RCXxdw3tW3J").toUriString();
  }

  private YahooFinanceResponse callApiWithCookie(String url) {
    HttpHeaders headers = new HttpHeaders();
    headers.set("Cookie", cookie);
    HttpEntity<Void> entity = new HttpEntity<>(headers);
    ResponseEntity<YahooFinanceResponse> response = restTemplate.exchange(url,
        HttpMethod.GET, entity, YahooFinanceResponse.class);
    return response.getBody();
  }

}
