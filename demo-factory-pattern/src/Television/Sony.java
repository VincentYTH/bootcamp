package Television;

public class Sony implements OLED, LCD {
  private double size;

  public Sony(double size){
    this.size = size;
  }

  @Override
  public double getSize(){
    return this.size;
  }
}
