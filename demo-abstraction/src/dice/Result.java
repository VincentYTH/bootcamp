package dice;

public class Result {
  
  private Color color;
  private FCP fcp;

  public void setFCP(FCP fcp){
    this.fcp = fcp;
  }

  public void setColor(Color color){
    this.color = color;
  }

  public int score(){
    return fcp.getValue() + color.getValue();
  }
}
