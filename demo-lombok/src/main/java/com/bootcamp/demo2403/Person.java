package com.bootcamp.demo2403;

import lombok.Value;

// read-only
@Value // AllargsConstructor + Getter + ToString + EqualsAndHashCode
public class Person {
  private String name; // final
  private int age; // final

  public static void main(String[] args) {
    Person p1 = new Person("Vincent", 20);
    Person p2 = new Person("Vincent", 20);
    p1.getAge();
    System.out.println(p1);
    System.out.println(p1.equals(p2)); // true

  }
}
