package com.bootcamp.project.project_yahoo_finance.dto;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.Map;
import com.bootcamp.project.project_yahoo_finance.entity.StockEntity;
import com.bootcamp.project.project_yahoo_finance.mapper.StockMapper;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataListDTO {

  @JsonIgnore
  private String marketTime;

  @JsonIgnore
  private StockEntity data;

  @JsonIgnore
  private String symbol;

  public void setMarketTime(long marketTime) {
    Instant instant = Instant.ofEpochSecond(marketTime);
    this.marketTime = String.valueOf(LocalDateTime.ofInstant(instant, ZoneId.systemDefault()));
  }

  @JsonAnyGetter
  public Map<String, Map<String, Object>> getAdditionalProperties() {
    Map<String, Map<String, Object>> result = new HashMap<>();
    Map<String, Object> dataMap = new HashMap<>();
    dataMap.put("MarketTime", marketTime);
    dataMap.put("Data", StockMapper.mapToAPIData(data));
    result.put("5MIN-".concat(symbol), dataMap);
    return result;
  }
}
