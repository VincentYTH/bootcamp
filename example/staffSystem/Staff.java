package staffSystem;

import java.time.LocalDate;

public class Staff {
  
  private String name;
  private LocalDate joinDate;
  private double salry;

  public Staff(String name, LocalDate joinDate){
    this.name = name;
    this.joinDate = joinDate;
  }

  public String getName(){
    return this.name;
  }

  public LocalDate getJoinDate(){
    return this.joinDate;
  }

  public double getSalry(){
    return this.salry;
  }

  public void setSalry(double salry){
    this.salry = salry;
  }

}
