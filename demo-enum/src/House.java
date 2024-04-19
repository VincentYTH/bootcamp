public class House {
  
  private Direction direction;


  public House(Direction direction) {
    this.direction = direction;
  }

  public void setDirection(Direction direction) {
    this.direction = direction;
  }

  public Direction getDirection() {
    return this.direction;
  }

  public Direction oppsite2(){
    return this.direction.opposite2();
  }
}
