package com.bootcamp.project.project_yahoo_finance.controller.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.project.project_yahoo_finance.controller.StockListOperation;
import com.bootcamp.project.project_yahoo_finance.dto.DataListDTO;
import com.bootcamp.project.project_yahoo_finance.dto.SystemDateDTO;
import com.bootcamp.project.project_yahoo_finance.entity.StocksListEntity;
import com.bootcamp.project.project_yahoo_finance.model.DataList;
import com.bootcamp.project.project_yahoo_finance.model.SystemDate;
import com.bootcamp.project.project_yahoo_finance.service.StockListService;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
public class StockListController implements StockListOperation {

  @Autowired
  private StockListService stockListService;

  @Override
  public List<StocksListEntity> getStockList() throws JsonProcessingException{
    return stockListService.getStockList();
  }

  @Override
  public SystemDateDTO getSystemDate(String symbol) throws JsonProcessingException{
    SystemDate systemDate = stockListService.getSystemDate(symbol);
    SystemDateDTO systemDateDTO = new SystemDateDTO();
    systemDateDTO.setSymbol(symbol);
    systemDateDTO.setSystemDate(systemDate.getSystemDate());
    return systemDateDTO;
  }

  @Override
  public DataListDTO getDataList(String symbol) throws JsonProcessingException {
    DataList dataList = stockListService.getDataList(symbol);
    DataListDTO dataListDTO = new DataListDTO();
    dataListDTO.setSymbol(symbol);
    dataListDTO.setMarketTime(dataList.getMarketTime());
    dataListDTO.setData(dataList.getData());
    return dataListDTO;
  }
}
