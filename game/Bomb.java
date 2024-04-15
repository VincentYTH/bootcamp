package game;

import java.util.Random;
import java.util.Scanner;

public class Bomb {
  public static void main(String[] args) {
    int bombNum = new Random().nextInt(1, 100);
    System.out.println(bombNum);
    
    Scanner inputNum = new Scanner(System.in);
    System.out.println("Please pick a number between 1 - 100.");
    int pickNum = inputNum.nextInt();

    int max = 100;
    int min = 1;

    while (pickNum != bombNum) {
      if (pickNum < bombNum) {
        if (pickNum > max || pickNum < min) {
          System.out.println("Input valid! Please pick a number between " + min + "-" + max);
          inputNum = new Scanner(System.in);
          pickNum = inputNum.nextInt();
        }else {
        min = pickNum;
        inputNum = new Scanner(System.in);
        System.out.println("Game Continue, please pick a number between " + pickNum + "-" + max);
        pickNum = inputNum.nextInt();
      }
      }else if (pickNum > bombNum){
        if (pickNum > max || pickNum < min) {
          System.out.println("Input valid! Please pick a number between " + min + "-" + max);
          inputNum = new Scanner(System.in);
          pickNum = inputNum.nextInt();
        }else {
        max = pickNum;
        inputNum = new Scanner(System.in);
        System.out.println("Game Continue, please pick a number between " + min + "-" + pickNum);
        pickNum = inputNum.nextInt();
      }
      }
    }
    if (pickNum == bombNum){
      inputNum.close();
      System.out.println("Game Over! The bombNum is " + pickNum + ".");
    }

  }
}
