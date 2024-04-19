package electronicDevice;

public class BasicFunction implements ElectronicDevice {
  
  private int battery;

  public BasicFunction(int battery){
    this.battery = battery;
  }

  public int getBattery(){
    return this.battery;
  }

  public void setBattery(int battery){
    this.battery = battery;
  }

  @Override
  public void powerOn(){
    if (battery > 0) {
      System.out.println("Deviec is powered on.");
    }
  }

  @Override
  public void powerOff(){
    System.out.println("Deviec is powered off.");
  }

  @Override
  public void charge(){
    battery = 100;
    System.out.println("Deviec is fully charged.");
  }
}
