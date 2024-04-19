public class Animal {

  public static String x = "abc";
  
  private String name;
  private double weight;

  public Animal(){

  }

  public Animal(String name, double weight){
    this.name = name;
    this.weight = weight;
  }
  
  public String getName(){
    return this.name;
  }

  public void setName(String name){
    this.name = name;
    System.out.println("call animal");
  }

  public void sleep(){
    System.out.println("sleeping");
  }

  public void run(){
    System.out.println("running");
  }
  
  public String lowerY(){
    return Cat.y.toLowerCase();
  }

}
