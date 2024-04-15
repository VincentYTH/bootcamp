package staticblock;

public class Student {
  
  public static final String collegeName;

  public static String abc = initialize();

  // Instance variable
  private String name;

  private static String initialize(){
    System.out.println("initialize()");
    return "Hello";
  }

  // Static block
  static{
    System.out.println("Static");
    collegeName = "ABC";
  }

  // Instance block
  {
    System.out.println("Instance block");
  }

  public Student(String name){
    System.out.println("Contructor");
    if (name != null) {
      this.name = name;
    }
  }

  public static void main(String[] args) {
    System.out.println("main start");
    Student s = new Student("Jenny");
    Student s2 = new Student("Sally");
    System.out.println("abc=" + abc);
    System.out.println("main end");
    
  }
}
