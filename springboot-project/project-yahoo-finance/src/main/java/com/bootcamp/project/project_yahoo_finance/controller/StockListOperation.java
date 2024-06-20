package com.bootcamp.project.project_yahoo_finance.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.bootcamp.project.project_yahoo_finance.dto.DataListDTO;
import com.bootcamp.project.project_yahoo_finance.dto.SystemDateDTO;
import com.bootcamp.project.project_yahoo_finance.entity.StocksListEntity;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface StockListOperation {
  
  @GetMapping(value = "/stocklist_get")
  List<StocksListEntity> getStockList() throws JsonProcessingException; 

  @GetMapping(value = "/system_date/{symbol}")
  SystemDateDTO getSystemDate(@PathVariable String symbol) throws JsonProcessingException;

  @GetMapping(value = "/get_data/5min/{symbol}")
  DataListDTO getDataList(@PathVariable String symbol) throws JsonProcessingException;

}
