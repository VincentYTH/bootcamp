package com.bootcamp.project.project_yahoo_finance.service.impl;

import java.time.Duration;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bootcamp.project.project_yahoo_finance.entity.StockEntity;
import com.bootcamp.project.project_yahoo_finance.entity.StocksListEntity;
import com.bootcamp.project.project_yahoo_finance.infra.NotFoundException;
import com.bootcamp.project.project_yahoo_finance.infra.RedisHelper;
import com.bootcamp.project.project_yahoo_finance.model.DataList;
import com.bootcamp.project.project_yahoo_finance.model.SystemDate;
import com.bootcamp.project.project_yahoo_finance.repository.StockRepository;
import com.bootcamp.project.project_yahoo_finance.repository.StocksListRepository;
import com.bootcamp.project.project_yahoo_finance.service.StockListService;
import com.fasterxml.jackson.core.JsonProcessingException;

@Service
public class StockListServiceImpl implements StockListService {

  @Autowired
  private StockRepository stockRepository;

  @Autowired
  private StocksListRepository stocksListRepository;

  @Autowired
  private RedisHelper redisHelper;

  @Override
  public List<StocksListEntity> getStockList() throws JsonProcessingException {
    StocksListEntity[] stocksArr =
        redisHelper.get("STOCK-LIST", StocksListEntity[].class);
    if (stocksArr != null) {
      return Arrays.asList(stocksArr);
    }
    List<StocksListEntity> stocksListEntities = stocksListRepository.findAll();
    this.redisHelper.set("STOCK-LIST", stocksListEntities,
        Duration.ofHours(24L));
    return stocksListEntities;
  }

  @Override
  public SystemDate getSystemDate(String symbol)
      throws JsonProcessingException {
    SystemDate systemDateRedis =
        redisHelper.get("SYSDATE-".concat(symbol), SystemDate.class);
    if (systemDateRedis != null) {
      return systemDateRedis;
    } else {
      SystemDate systemDate = new SystemDate();
      Optional<List<StockEntity>> stockOptional =
          stockRepository.findBySymbol(symbol);
      if (!stockOptional.get().isEmpty()) {
        List<StockEntity> stockEntities = stockOptional.get();
        StockEntity targetStock = stockEntities.stream()
            .max(Comparator.comparing(StockEntity::getRegularMarketUnix))
            .orElse(null);
        systemDate.setSymbol(symbol);
        systemDate.setSystemDate(targetStock.getMarketTimeInNormalTimeStamp());
        this.redisHelper.set("SYSDATE-".concat(symbol), systemDate,
            Duration.ofHours(4));
        return systemDate;
      }
      throw new NotFoundException();
    }
  }

  @Override
  public DataList getDataList(String symbol) throws JsonProcessingException {
    Optional<List<StockEntity>> stockOptional = stockRepository.findBySymbol(symbol);
    if (!stockOptional.get().isEmpty()) {
      List<StockEntity> stockEntities = stockOptional.get();
      StockEntity targetStock = stockEntities.stream()
          .max(Comparator.comparing(StockEntity::getRegularMarketUnix))
          .orElse(null);
      DataList dataListRedis = redisHelper.get("5MIN-".concat(symbol), DataList.class);
      if (dataListRedis != null) {
        if (targetStock.getRegularMarketUnix() > dataListRedis.getMarketTime()) {
          DataList dataList = new DataList();
          dataList.setSymbol(symbol);
          dataList.setMarketTime(targetStock.getRegularMarketUnix());
          dataList.setData(targetStock);
          this.redisHelper.set("5MIN-".concat(symbol), dataList, Duration.ofHours(12));
          return dataList;
        } else {
          return dataListRedis;
        }
      } else {
        DataList dataList = new DataList();
        dataList.setSymbol(symbol);
        dataList.setMarketTime(targetStock.getRegularMarketUnix());
        dataList.setData(targetStock);
        this.redisHelper.set("5MIN-".concat(symbol), dataList, Duration.ofHours(12));
        return dataList;
      }
    }
    throw new NotFoundException();
  }

}
