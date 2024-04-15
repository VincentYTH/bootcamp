import java.util.Arrays;

public class Test {
  public static void main(String[] args) {
    Car car=new Car();//Still work, because the class "Car" is public
    car.setSpeed(100);
    System.out.println(car.getSpeed());//100
    System.out.println(car.getColor());//null(default value)
    System.out.println(car.getCapacity());//0(default value)

    if (car.isOverSpeed()) {// -> car.isOverSpeed()==true
      
    }

    //int[] integers=null;
    //integers[0]=1;//null pointer exception
    //int x=null;//unwork

    Integer x=null;
    String s="hello";//char[] -> 'h','e'......
    boolean b=false;
    System.out.println(b);//initialization before use

  }
}
