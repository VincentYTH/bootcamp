package shape;

import java.math.BigDecimal;

// 1. You can implements more than one Interface in a class
public class Circle1 implements Shape1{
  
  private double radius;

  @Override
  public double area(){
    return BigDecimal.valueOf(this.radius).
    multiply(BigDecimal.valueOf(this.radius)).
    multiply(Shape1.PI).doubleValue();
  }

  @Override
  public String print(){
    return String.valueOf(this.radius);
  }

  public void sleep(){
    System.out.println("Sleep...");
  }

  public static void main(String[] args) {
    Shape1 s = new Circle1(); // Polymorhism
    s.area();
    s.print();
    // s.sleep();
  }




}
