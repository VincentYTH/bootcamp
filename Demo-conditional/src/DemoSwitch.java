public class DemoSwitch {
  // switch need break to find out the specfic value
  // switch Cannot Compare Value(Range)
  public static void main(String[] args) {

    // Example@3
    // score>90 -> A
    // 80~90 -> B
    // 70~79 -> C
    // Below 70 -> F
    // grade A:5, B:4, C:3, F:0
    char grade = 'A';
    switch (grade) {
      case 'A':
        System.out.println("This is grade A");
        break;
      case 'B':
        System.out.println("This is grade B");
        break;
      case 'C':
        System.out.println("This is grade C");
        break;
      default:
        System.out.println("Default Value");
    }

    int A = 5;
    int B = 4;
    int C = 3;
    int F = 0;
    int score = 0;
    switch (grade) {
      case 'A':
        score = A;
        System.out.println("The Score is " + score);
        break;
      case 'B':
        score = B;
        System.out.println("The Score is " + score);;
        break;
      case 'C':
        score = C;
        System.out.println("The Score is " + score);
        break;
      case 'F':
        score = F;
        System.out.println("The Score is " + score);
        break;
      default:
        break;
    }
  }
}
