package methods;

public class Staff {
  
  private String Name;

  private double salary;


  // Constructor
  private Staff(String Name, double salary){
    this.Name = Name;
    this.salary = salary;
  }

  // Static Mothod
  public static Staff of(String Name, double salary){
    return new Staff(Name, salary);
  }

  // public static Staff peter(){
  //   return new Staff("peter");
  // }


  // Instance Method(belongs object)
  public double getSalary(){
    return this.salary;
  }




}
