package objects;

import java.time.LocalDate;

public class Staff { // 1. All class implicitly extends Topmost class "Object"
  
  private LocalDate joinDate;

  public Staff(LocalDate joinDate){
    this.joinDate = joinDate;
  }

  public LocalDate getJoinDate(){
    return this.joinDate;
  }

  @Override
  public String toString(){ // 2. Every class should implement/override its own toString() to represent its object values
    return "Staff("//
    + "join Date: "//
    + this.joinDate + ")";
  }

  public static void main(String[] args) {
    Object o = new Object(); // Object -> by defalut extends class
    System.out.println(o.toString()); // java.lang.Object@2f92e0f4 -> object reference
    
    Staff s = new Staff(LocalDate.now());
    System.out.println(s.toString()); // Staff(join Date: 2024-04-17)

    Staff s2 = new Staff(LocalDate.now());

    System.out.println(s.getJoinDate().compareTo(s2.getJoinDate()) == 0); // true
  }
}
