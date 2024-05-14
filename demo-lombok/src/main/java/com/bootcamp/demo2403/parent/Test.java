package com.bootcamp.demo2403.parent;

public class Test {
  public static void main(String[] args) {
    Car car = Car.of("ABC");
    car.setWeight(40.0);
    System.out.println(car.toString());
  }
}
