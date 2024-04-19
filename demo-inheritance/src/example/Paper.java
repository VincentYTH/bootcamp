package example;

public class Paper extends Material {
  
  private PaperOrigin origin;
  private double size;

  public Paper(PaperOrigin origin, double size, double price, int quantity){
    super(price, quantity);
    this.origin = origin;
    this.size = size;
  }

  public static void main(String[] args) {
    Paper p1 = new Paper(PaperOrigin.CHINA, 17.5, 0.5, 1000);
    System.out.println(p1.getPrice());
    System.out.println(p1.getQuantity());
  }
}
