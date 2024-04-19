package dice;

public class Player {
  
  public int getScore(){
    Roll[] dices = new Roll[] {new Dice1(), new Dice2()};
    int sum = 0;
    for (Roll dice : dices){
      sum += dice.roll();
    }
    return sum;
  }

  public Result getResult(){
    Result result = new Result();
    result.setColor(new Dice1().roll2());
    result.setFCP(new Dice2().roll2());
    return result;
  }

  public static void main(String[] args) {
    Player p1 = new Player();
    System.out.println(p1.getScore());
    System.out.println(p1.getScore());
    System.out.println(p1.getResult().score());
    System.out.println(p1.getResult().score());
  }

}
