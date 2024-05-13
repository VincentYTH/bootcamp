public class Test {
  public static void main(String[] args) {
    Outer o1 = new Outer();
    System.out.println(o1.getX()); // 10
    System.out.println(Outer.getY()); // 100

    Outer.StatidNested o2 = new Outer.StatidNested();
    o2.print(); // Hi 100

    Outer.Inner o3 = new Outer().new Inner();
    o3.print(); // Hello 10100

    Outer o4 = new Outer();
    o4.print(); // er....20

    // before Java 8 (before lambda)
    Drivable vincent = new Drivable() {
      @Override
      public void drive(){
        System.out.println("I can drive");
      }
      @Override
      public void abc(){
        System.out.println("abc...");
      }
    };
    vincent.drive(); // I can drive
    vincent.abc(); // abc...

    Ball ball = Ball.builder()
    .setColor(Ball.Color.BLACK)
    .setWeight(22.0d)
    .build();
    System.out.println(ball);
  }
}
