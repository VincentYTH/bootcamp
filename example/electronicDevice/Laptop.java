package electronicDevice;

import java.util.Objects;

public class Laptop extends BasicFunction {

  private String name;

  public Laptop(String name, int battery){
    super(battery);
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  @Override
   public boolean equals(Object obj){
    if (this == obj)
    return true;
    if (!(obj instanceof Laptop))
    return false;
    Laptop Laptop = (Laptop) obj;
    return Objects.equals(this.name, Laptop.getName());
   }

   @Override
   public int hashCode(){
    return Objects.hash(this.name);
   }

  public static void main(String[] args) {
    Laptop device3 = new Laptop("Macbook Air", 77);
    Laptop device4 = new Laptop("Macbook Air", 60);
    device3.charge();
    System.out.println(device3.getBattery()); // 100
    System.out.println(device3.equals(device4));


  }
}
