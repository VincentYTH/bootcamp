package com.bootcamp.demo.demo_sb_dto.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

// DTO stands for Data Transfer Object
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StockDTO {
  private int stockNo;
  private int quantity;
}
