package sport;

public class Staff implements Action {
  
  @Override
  public void run(){
    System.out.println("Running");
  }

  @Override
  public void walk(){
    System.out.println("Walking");
  }

  @Override
  public void swim(){
    System.out.println("Swimming");
  }

  
}
