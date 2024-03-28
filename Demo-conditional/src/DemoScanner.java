import java.util.Scanner;

public class DemoScanner {
  public static void main(String[] args) {
    // Get User Input
    Scanner s = new Scanner(System.in);
    System.out.println("Please input a number:");
    int input= s.nextInt();
    System.out.println("input="+input);

    Scanner Test=new Scanner(System.in);
    System.out.println("Give me a No.");
    double No=Test.nextDouble();
    System.out.println("No.= "+No);

  }
}