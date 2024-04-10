package Quest;
public class JavaQuest14 {
  // Given an integer x, return true if x is a palindrome (迴文), and false
  // otherwise.
  // Palindrome: it is same text, no matter you read it from left to right, or
  // from right to left

  // Case 1: 13431
  // true

  // Case 2: -123
  // false

  // Case 3: 1
  // true

  // Case 4: 22
  // true

  // Case 5: 1231
  // false

  // Do not change anything in main method
  public static void main(String[] args) {
    boolean res1 = palindrome(13431); // true
    boolean res2 = palindrome(-121); // false
    boolean res3 = palindrome(1); // true
    boolean res4 = palindrome(22); // true
    boolean res5 = palindrome(1231); // false

    System.out.println(res1);
    System.out.println(res2);
    System.out.println(res3);
    System.out.println(res4);
    System.out.println(res5);

  }

  // Code a method here to return true if the integer is palindrome, otherwise
  // false
  public static boolean palindrome(int num) {
    if (num < 0) {
      return false;
    }

    int oldNum = num;
    int newNum = 0;

    while (num != 0) {
      int digit = num % 10;// loop1: 13431->1; loop2: 1343->3; loop3: 134->4; loop4: 13->3; loop5: 1->1
      newNum = newNum * 10 + digit;// 1; 13; 134; 1343; 13431    1,13,132,1321
      num /= 10;// 1343; 134; 13; 1; 0
    }
    return oldNum == newNum;
  }
}
