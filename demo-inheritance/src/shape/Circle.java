package shape;

import java.math.BigDecimal;
import java.util.Objects;

public class Circle extends Shape {
  
  private double radius;

  public double area(){
    return BigDecimal.valueOf(this.radius).//
    multiply(BigDecimal.valueOf(this.radius)).//
    multiply(BigDecimal.valueOf(Math.PI)).//
    doubleValue();
  }

  public double getRadius(){
    return this.radius;
  }

  @Override // 6*
  public boolean equals(Object o){ // Method Signature
    if (this == o)
        return true;
    if (!(o instanceof Circle)) // The relationship between Object object and Circle object
        return false;
    Circle circle = (Circle) o;
    return Objects.equals(this.radius, circle.getRadius());
  }

  public static void main(String[] args) {
    Circle c = new Circle();
    Circle c2 = new Circle();
    Circle c3 = c;
    
    System.out.println(c.equals(c2)); // true
    System.out.println(c.equals(c3)); // true
    
  }
}
