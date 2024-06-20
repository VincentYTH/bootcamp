package com.bootcamp.project.project_yahoo_finance.service;

import java.util.List;
import com.bootcamp.project.project_yahoo_finance.entity.StocksListEntity;
import com.bootcamp.project.project_yahoo_finance.model.DataList;
import com.bootcamp.project.project_yahoo_finance.model.SystemDate;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface StockListService {

  List<StocksListEntity> getStockList() throws JsonProcessingException;

  SystemDate getSystemDate(String symbol) throws JsonProcessingException;

  DataList getDataList(String symbol) throws JsonProcessingException;
}
