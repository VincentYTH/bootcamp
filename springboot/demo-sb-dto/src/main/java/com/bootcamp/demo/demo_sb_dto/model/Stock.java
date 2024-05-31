package com.bootcamp.demo.demo_sb_dto.model;

import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Stock {
  private int id;
  private String description;
  private int quantity;

  @Override
  public boolean equals(Object obj){
    if (this == obj)
      return true;
    if (!(obj instanceof Stock))
      return false;
    Stock stock = (Stock) obj;
    return Objects.equals(this.id, stock.getId());
  }
}
