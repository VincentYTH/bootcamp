package com.bootcamp.demo2403;

public class Test {
  public static void main(String[] args) {
    Staff s1 = new Staff("Vincent", 30, 20000);
    Staff s2 = new Staff("Ray", 32, 25000);
    Staff s3 = new Staff("Ray", 32, 25000);
    s1.setAge(28);
    s1.setSalary(22000);
    System.out.println(s2.hashCode());
    System.out.println(s3.hashCode());
    System.out.println(s1.toString());
    System.out.println(s2.equals(s3)); // true since class staff has @EqualsAndHashCode

    Dog d1 = new Dog();
    Dog d2 = new Dog();
    System.out.println(d1.equals(d2)); // false

    Order order = new Order("o2");
    Customer c1 = new Customer("Vincent");
    Customer c2 = new Customer("Vincent");
    Customer c3 = new Customer("Vincent");
    Customer c4 = new Customer("Vincent");
    c1.add(new Order("o1"));
    c2.add(new Order("o1"));
    c3.add(order);
    c4.add(order);
    System.out.println(c1.equals(c2)); // true since override equals/hashcode
    System.out.println(c3.equals(c4)); // true since add the same object
    System.out.println(c1.orderCount()); // 1

    System.out.println(Customer.orderCount(c2)); // 1

    Staff t1 = Staff.builder()
    .name("Vincent")
    .age(25)
    .salary(22500)
    .build();
    System.out.println(t1.toString());
  }
}
