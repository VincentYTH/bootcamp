package com.bootcamp.demo2403;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Superman {
  
  private Cat cat;

  public int sum(int x){
    if (this.cat.sum(x, 10) + this.cat.subtract(100, x) > 5){
      return 99;
    }
    return 50;
  }
}
