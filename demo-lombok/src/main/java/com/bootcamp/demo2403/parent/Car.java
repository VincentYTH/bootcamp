package com.bootcamp.demo2403.parent;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor(staticName = "of")
@ToString(callSuper = true) // by default is false
@EqualsAndHashCode(callSuper = true)

public class Car extends BigCar {
  private String model;

  // public Car(String model){
  //   super(); // by default, parent class need to insert "NoArgsConstructor"
  //   this.model = model;
  // }

  // Custom Constructor
  // public Car(String model, double weight){
  //   super(weight);
  //   this.model = model;
  // }

  public static void main(String[] args) {
    Car car = new Car("Y"); // AllargsConstructor
    car.setWeight(30.0);
    System.out.println(car.getWeight());
    System.out.println(car.toString());

    Car car2 = Car.of("Y");
    car2.setWeight(30.0);
    System.out.println(car.equals(car2)); // true

    Car car3 = new Car(null);
    car3.setModel("CCB");
    System.out.println(car3);

  }
}
