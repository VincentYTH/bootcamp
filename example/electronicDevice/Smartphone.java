package electronicDevice;

import java.util.Objects;

public class Smartphone extends BasicFunction {
  
  private String name;

  public Smartphone(String name, int battery){
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
    if (!(obj instanceof Smartphone))
    return false;
    Smartphone smartphone = (Smartphone) obj;
    return Objects.equals(this.name, smartphone.getName());
   }

   @Override
   public int hashCode(){
    return Objects.hash(this.name);
   }

  public static void main(String[] args) {
    Smartphone device = new Smartphone("Iphone15", 77);
    Smartphone device2 = new Smartphone("Iphone14 Pro", 60);
    device.charge();
    System.out.println(device.getBattery()); // 100
    System.out.println(device.equals(device2));


  }
}
