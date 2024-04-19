package shape;

import java.math.BigDecimal;

public interface Shape1 {
  // 100% abstraction -> No any implementation in interface
  // Interface is a contract that the class should implement

  // No instance variable in interface
  // You can only define "public static final" variable in interface
  String s = "hello"; // -> public static final String s = "hello";
  BigDecimal PI = BigDecimal.valueOf(Math.PI);

  // Implicitly public
  double area();
  String print();

  // static method, with implementation class
  // public static double area(Square[] squares){

  // }

  // public static double area(Circle[] circles){

  // }

  public static double area(Shape1[] shapes){
    BigDecimal sum = BigDecimal.valueOf(0.0);
    for (Shape1 shape : shapes){
      sum = sum.add(BigDecimal.valueOf(shape.area()));
    }
    return sum.doubleValue();
  }

  public static void main(String[] args) {
    System.out.println(Shape1.s); // hello
    
    Shape1[] shapes = new Shape1[3];
    shapes[0] = new Circle1();
    shapes[1] = new Square1();
    
  }
}
