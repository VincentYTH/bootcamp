package methods;

public class Test {

  private int v;

  public Test(int v){
    this.v = v;
  }

  // Instance method can access parameters + instance variable
  public int sum(int x, int y){// method sum belongs to object
    return x + y + this.v;
  }

  //* Static method can access parameters
  // but cannot access (read/write) instance variable
  public static int sum2(int x, int y){// method sum2 belongs to Class
    return x + y;
  }

  public static void test(String[] arr){

  }

  public static void test2(String ... arr){
    
  }

  public static void main(String[] args) {
    // Staff s1 = new Staff("John");// private constructor

    // Static Method
    Staff s2 = Staff.of("John");
    // Staff s3 = Staff.peter();

    // Instance Method
    double salary = s2.getSalary();
    System.out.println(salary);

    Test t = new Test(3);
    System.out.println(t.sum(1, 100));// 104 (Instance Method)
    System.out.println(Test.sum2(1, 100));// 101 (Static Method)

    test2("hello", "world", "ccc");
    test2(new String[]{"hello", "world", "ccc"});
    test(new String[]{"hello", "world", "ccc"});

    System.out.println(Staff.PI);

  }

  public int getV() {
    return v;
  }

  public void setV(int v) {
    this.v = v;
  }
}
