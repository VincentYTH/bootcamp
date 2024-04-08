public class ABC {
  public static void main(String[] args) {
    System.out.println("hi");
    Car c = new Car();//c -> object reference
    Car c2= new Car();
    c.setColor("RED");
    c.setSpeed(85.5);
    c.setCapacity(4);
    c2.setColor("GREEN");
    c2.setSpeed(90);
    c2.setCapacity(5);
    System.out.println(c.getColor());
    System.out.println(c.getSpeed());
    System.out.println(c.getCapacity());
    System.out.println(c2.getColor());
    System.out.println(c2.getSpeed());
    System.out.println(c2.getCapacity());
    System.out.println(c2.isOverSpeed());
    System.out.println(c2.toString());
}


}