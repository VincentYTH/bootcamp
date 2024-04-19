package abstracts;

public abstract class SuperObject {
  
  private double weight;

  public double getWeight(){
    return this.weight;
  }

  public void setWeight(double weight){
    this.weight = weight;
  }

  public abstract void sit();

}
