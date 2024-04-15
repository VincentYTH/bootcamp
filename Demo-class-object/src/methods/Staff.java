package methods;

public class Staff {

  // Static Final Variable (Class Constant, belongs to class)
  public static final double PI = 3.14159;

  // Final Variable (Constant, belongs to object)
  private final int HOURS_OF_DAY = 24; 
  
  // Instance Variable
  private String name;
  private double salary;

  // Static Variable
  private static int ageLimit;// default 0

  // Constructor
  private Staff(String name){
    this.name = name;
  }

  // Instance Method(belongs to object)(refer to "this")
  public double getSalary(){
    return this.salary;
  }

  public int getHOURS_OF_DAY(){
    return this.HOURS_OF_DAY;
  }

  // Static Method(belongs to class)
  public static Staff of(String Name){
    return new Staff(Name);
  }

  // Getter
  public static int getAgeLimit(){
    return ageLimit;
  }

  // public static Staff peter(){
  //   return new Staff("peter");
  // }

  public static void main(String[] args) {
    Staff.ageLimit = 12;// read
    System.out.println(Staff.ageLimit);// write

    Staff s1 = Staff.of("Vincent");
    System.out.println(s1.ageLimit);// 12 with warning
    
    // Oject can access static variable(not suppose to)
    // Static method cannot access instance variable

    // Final Instance Variable
    System.out.println(s1.getHOURS_OF_DAY());// 24
    Staff s2 = Staff.of("Jenny");


  }

}
