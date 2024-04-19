public enum Direction {// class: when starting the java program, JVM new 4 objects of Direction

  EAST(1, 'E'),//
  WEST(-1, 'W'),//
  NORTH(2, 'N'),//
  SOUTH(-2, 'S');

  // You cannot create Direction object by yourself.

  private int value;
  // private char c;

  private Direction(int value, char c){
    this.value = value;
    // this.c = c;
  }

  // private Direction(int value){
  //   this.value = value;
  // }

  public void setValue(int value){
    this.value = value;
  }

  public int getValue(){
    return this.value;
  }

  public static Direction opposite(Direction direction){
    if (direction == null) {
      return null;
    }
    for (Direction d : Direction.values()){// values -> static method(implicit)
      if (direction.getValue() * -1 == d.getValue()) {
        return d;
      }
    }
    return null;
  }

  public Direction opposite2(){
    for (Direction d : Direction.values()){
      if (this.value * -1 == d.getValue()){
        return d;
      }
    }
    return null;
  }

  public static void main(String[] args) {
    // check if the direction is EAST?
    House house = new House(Direction.EAST);// set an address of enum object
    house.setDirection(Direction.NORTH);
    System.out.println(house.getDirection() == Direction.EAST);// false
    System.out.println(Direction.NORTH.getValue());// 3

    System.out.println(Direction.opposite(EAST));// WEST
    System.out.println(house.oppsite2());// SOUTH
    System.out.println(Direction.EAST.opposite2().name());// WEST

    Direction direction = Direction.NORTH;
    System.out.println(getDirectionDegree(direction));// 360
  }

  public static int getDirectionDegree(Direction direction){
    int result = -1;
    switch (direction) {
    case NORTH:
      // return 360;
      result = 360;
      break;
    case EAST:
      // return 90;
      result = 90;
      break;
    case SOUTH:
      // return 180;
      result = 180;
      break;
    case WEST:
      // return 270;
      result = 270;
      break;
    default:
      return -1;
    }
    return result;
  }
}
