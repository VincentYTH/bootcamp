package Television;

public class Samsung implements OLED, LCD {
  private double size;

  public Samsung(double size){
    this.size = size;
  }

  @Override
  public double getSize(){
    return this.size;
  }

}
