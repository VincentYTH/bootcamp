package com.bootcamp.demo.demosbcalculator.model;

import java.util.LinkedList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Cat {
  private String name;
  private int age;
  private List<Color> colors;

  public final static List<Cat> catsList = new LinkedList<>();
}
