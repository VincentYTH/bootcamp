package com.bootcamp.demo2403;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Calculator {

  private int x;
  private Cat cat;

  public int sum(){
    // return new Cat(this.x, 10).sum() + 3;
    return this.cat.sum(this.x, 10) + 3;
  }

  public static void main(String[] args) {
    Calculator calculator = new Calculator(8, new Cat());
    System.out.println(calculator.sum()); // 21
  }

}
