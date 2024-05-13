package shape;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public interface Shape {
  // attribute
  double area();

  // default method -> instance method

  // static method
  static double area(List<Shape> shapes){
    BigDecimal bd = BigDecimal.valueOf(0);
    for (Shape s : shapes){
      bd = bd.add(BigDecimal.valueOf(s.area()));
    }
    return bd.doubleValue();
  }

  static <T extends Shape> double area2(List<T> shapes){
    BigDecimal bd = BigDecimal.valueOf(0);
    for (Shape s : shapes){
      bd = bd.add(BigDecimal.valueOf(s.area()));
    }
    return bd.doubleValue();
  }

  static <T extends Collection<Number>> double area3(T shape){
    // Queue<Number>
    // Set<Number>
    // List<Number>
    return -1;
  }

  // Approach 1
  static <T extends Number> double area4(Queue<T> shape){
    return -1;
  }

  // Approach 2
  static double area5(Queue<? extends Number> shape){
    return -1;
  }

  static double area6(Queue<? super Number> shape){
    return -1;
  }

  public static void main(String[] args) {
    Circle c = new Circle(3.0d);
    Square s = new Square(5.0d);
    List<Shape> shapes = new LinkedList<>();
    shapes.add(c);
    shapes.add(s);
    
    List<Object> objects = new LinkedList<>();
    objects.add(new Circle(3.4));
    // Shape.area2(objects); // -> compile error because Method Signature (<T extends Shape)

    List<Number> ll = new LinkedList<>();
    Shape.area3(ll);
    ll.add(10);
    ll.add(10.d);
    
    Set<Number> sn = new HashSet<>();
    sn.add(1L);
    Shape.area3(sn);
    
    Queue<Long> ql = new LinkedList<>();
    Shape.area4(ql);
    Shape.area5(ql);
    // Shape.area6(ql);
  }
}
