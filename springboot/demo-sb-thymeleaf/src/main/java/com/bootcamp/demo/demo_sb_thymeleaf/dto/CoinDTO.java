package com.bootcamp.demo.demo_sb_thymeleaf.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CoinDTO {
  private String id;
  private String image;
  private double currentPrice;
  private String lastUpdated;
}
