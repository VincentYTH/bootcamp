package com.bootcamp.demo.demosbcalculator.model;

import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Customer {
  private String name;
  private LocalDate joinDate;
  private List<Order> orders;
}
