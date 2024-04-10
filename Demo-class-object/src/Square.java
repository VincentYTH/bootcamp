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

public static void main(String[] args) {
  Square square=new Square();
  square.setLength(13);
  System.out.println(square.toString());//"Square(length=13)"
  System.out.println(square.getArea());//169
}