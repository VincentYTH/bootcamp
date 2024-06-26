package exercise;
/*
 * 
 * Question : Given an array of strings words, 
 * return the first palindromic(對稱) string in the array.
 *  If there is no such string, return an empty string "".
*/
public class JavaQuest18 {
  public static void main(String[] args) {
    String[] testCase1 = new String[] { "abc", "car", "ada", "racecar", "cool" };
    String[] testCase2 = new String[] { "notapalindrome", "racecar" };
    String[] testCase3 = new String[] { "ADABCCBADA", "car", "ada", "racecar" };
    String[] testCase4 = new String[] { "abc" };

    System.out.println(firstPalindrome(testCase1)); // Output : "ada"
    System.out.println(firstPalindrome(testCase2)); // Output : "racecar"
    System.out.println(firstPalindrome(testCase3)); // Output : "ADABCCBADA"
    System.out.println(firstPalindrome(testCase4)); // Output : "No Palindrome word in String Array."

  }

  private static boolean isPalindrome(String s) {
    // hints : if a String is Palindrome , return true
    //
    int firstChar = 0;
    int lastChar = s.length() - 1;
    while (firstChar<lastChar) {
      if (s.charAt(firstChar) != s.charAt(lastChar)) {
        return false;
      }
      firstChar++;
      lastChar--;
  }
    return true;
  }

  public static String firstPalindrome(String[] words) {
    // hints : finish the logic by using isPalindrome() , for-loop , if-else
    for (int i=0; i<words.length; i++){
      if (isPalindrome(words[i])) {
        return words[i];
      }
    }
    return "";
  }

}
