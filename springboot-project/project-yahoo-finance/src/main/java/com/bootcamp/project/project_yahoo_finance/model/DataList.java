package com.bootcamp.project.project_yahoo_finance.model;

import com.bootcamp.project.project_yahoo_finance.entity.StockEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataList {
  
  private long marketTime;

  private StockEntity data;

  private String symbol;

}
