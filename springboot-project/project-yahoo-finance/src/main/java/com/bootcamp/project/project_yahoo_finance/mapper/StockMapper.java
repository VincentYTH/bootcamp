package com.bootcamp.project.project_yahoo_finance.mapper;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import org.springframework.stereotype.Component;
import com.bootcamp.project.project_yahoo_finance.dto.DataDTO;
import com.bootcamp.project.project_yahoo_finance.entity.StockEntity;
import com.bootcamp.project.project_yahoo_finance.model.YahooFinanceResponse;

@Component
public class StockMapper {

  public StockEntity mapToStockEntity(YahooFinanceResponse response) {
    YahooFinanceResponse.Stock quote = response.getQuoteResponse().getResult().get(0);
    StockEntity stockEntity = new StockEntity();
    stockEntity.setAsk(quote.getAsk());
    stockEntity.setAskSize(quote.getAskSize());
    stockEntity.setBid(quote.getBid());
    stockEntity.setBidSize(quote.getBidSize());
    stockEntity.setRegularMarketChangePercent(quote.getRegularMarketChangePercent());
    stockEntity.setRegularMarketPrice(quote.getRegularMarketPrice());
    stockEntity.setSymbol(quote.getSymbol());
    stockEntity.setType("5 Minutes");
    stockEntity.setRegularMarketUnix(quote.getRegularMarketTime());
    stockEntity.setApiDateTime(LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS).toString());

    Instant instant = Instant.ofEpochSecond(quote.getRegularMarketTime());
    String marketTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).toString();
    stockEntity.setMarketTimeInNormalTimeStamp(marketTime);

    return stockEntity;
  }

  public static DataDTO mapToAPIData(StockEntity stockEntity) {
    DataDTO stockMapper = new DataDTO();
    stockMapper.setAsk(stockEntity.getAsk());
    stockMapper.setAskSize(stockEntity.getAskSize());
    stockMapper.setBid(stockEntity.getBid());
    stockMapper.setBidSize(stockEntity.getBidSize());
    stockMapper.setRegularMarketChangePercent(stockEntity.getRegularMarketChangePercent());
    stockMapper.setRegularMarketPrice(stockEntity.getRegularMarketPrice());
    return stockMapper;
  }
}

