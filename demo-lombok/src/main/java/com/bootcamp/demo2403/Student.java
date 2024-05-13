package com.bootcamp.demo2403;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@RequiredArgsConstructor

public class Student {
  @NonNull
  @Getter // within class, it can only activate below 1 row
  private String name;
  @Setter
  private int age;

  public static void main(String[] args) {
    Student s1 = new Student("Vincent", 20);
    s1.getName();
    s1.setAge(30);

    Student s2 = new Student(null);
    s2.getName();
  }
}
