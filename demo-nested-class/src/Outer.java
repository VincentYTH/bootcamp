public class Outer {
  private int x = 10;
  private static int y = 100;

  public static int getY(){
    return y;
  }

  public void print(){
    class LocalInner{
      int x;
      LocalInner(int x){
        this.x = x;
      }
      void print(){
        System.out.println("er...." + this.x);
      }
    }
    LocalInner li = new LocalInner(20);
    li.print(); // 20
  }

  static class StatidNested { // (public) 1. Static Nested Class (Static member of Outer Class)
    void print(){
      System.out.println("Hi " + y);
      // System.out.println("Hi " + x); // cannot access outer object instance variable x
    }
  }

  public class Inner { // 2. Inner Class (non-static) (Instance member of Outer Class)
    void print(){
      System.out.println("Hello " + x + y);
      // System.out.println("Hello" + Outer.this.x + Outer.y); // same as above
      // System.out.println("Hello" + this.x); // Not OK since "this" belongs to Outer object
    }
  }

  public int getX(){
    return this.x;
  }

}
