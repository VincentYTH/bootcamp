package com.bootcamp.demo.demosbcalculator.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Order {
  private int id;
  private List<Address> addresses;
}
