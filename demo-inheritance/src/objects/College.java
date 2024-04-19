package objects;

import java.util.Objects;

public class College {

  private double area;
  
  public double getArea(){
    return this.area;
  }

  @Override
  public boolean equals(Object obj){
    if (this == obj)
    return true;
    if (!(obj instanceof College))
    return false;
    College c = (College) obj;
    return Objects.equals(this.area, c.getArea());
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.area);
  }
  
  @Override
  public String toString(){
    return "College("//
    + "area = " + this.area//
    + ")";
  }

  public static void main(String[] args) {
    Object o = new College(); // Polymorphism 多形態
    // College c = new Object(); -> not Allow
    System.out.println(o.hashCode()); // 31, address -> int
    System.out.println(new College().hashCode()); // 31, after @Override the hashCode()
    System.out.println(o.equals(new College())); // true, after @Override the equals()

    if (o instanceof College) { // ask if o is an object of College.Class, insatanceof -> true/false
      College c = (College) o;
    }

    Class<?> s = o.getClass();
    System.out.println(s.getName()); // objects.College

    System.out.println(o.getClass().getName()); // objects.College

    String str = "ABC";
    System.out.println(str.hashCode()); // 64578

    System.out.println(o); // College(area = 0.0)


  }
}
