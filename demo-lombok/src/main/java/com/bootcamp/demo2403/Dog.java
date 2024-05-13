package com.bootcamp.demo2403;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


// Annotations
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Dog {
  private String name;
  private int age;

  // Custom Constructor
  public Dog(String name){
    this.name = name;
  }

}
