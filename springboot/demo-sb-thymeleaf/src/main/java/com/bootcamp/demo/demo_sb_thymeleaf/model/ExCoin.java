package com.bootcamp.demo.demo_sb_thymeleaf.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExCoin {
  private String id;
  private String symbol;
  private String name;
  private String image;
  @JsonProperty(value = "current_price")
  private double currentPrice;
  private double market_cap;
  private int market_cap_rank;
  private double fully_diluted_valuation;
  private double total_volume;
  private double high_24h;
  private double low_24h;
  private double price_change_24h;
  private double price_change_percentage_24h;
  private double market_cap_change_24h;
  private double market_cap_change_percentage_24h;
  private double circulating_supply;
  private double total_supply;
  private double max_supply;
  private double ath;
  private double ath_change_percentage;
  private String ath_date;
  private double atl;
  private double atl_change_percentage;
  private String atl_date;
  private Object roi;
  @JsonProperty(value = "last_updated")
  private String lastUpdated;
}
