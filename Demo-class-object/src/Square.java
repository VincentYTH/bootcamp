public class Square {

  private int length;

  public void setLength(int length){
    this.length=length;
  }

  // public int getLenth(){
  //   return this.length;
  // }

  public int getArea(){
    return this.length*this.length;
  }

  public String toString(){
    return "Square("//
    +"length="+this.length//
    +")";
  }

}
