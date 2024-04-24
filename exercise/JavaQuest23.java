package exercise;
/*
 * Question : 
 * given a string s of even length. 
 * Split this string into two halves of equal lengths, 
 * and let a be the first half and b be the second half.

Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U').
Notice that s contains uppercase and lowercase letters.

Return true if a and b are alike. 
Otherwise, return false.
 */

//hints : substring() , toCharArray() ?
public class JavaQuest23 {
  public static boolean sameNumberOfVowels(String s) {
    // code here ...
    if (s.length() % 2 != 0)
    return false;

    char[] arrLeft = new char[s.length() / 2];
    char[] arrRight = new char[s.length() / 2];
    arrLeft = s.substring(0, s.length() / 2).toCharArray();
    arrRight = s.substring(s.length() / 2, s.length()).toCharArray();
    String vowels = "aeiouAEIOU";

    int sumVowelsLeft = 0;
    int sumVowelsRight = 0;
    for (char c : arrLeft){
      if (vowels.contains(String.valueOf(c))) {
        sumVowelsLeft++;
      }
    }
    for (char c : arrRight){
      if (vowels.contains(String.valueOf(c))) {
        sumVowelsRight++;
      }
    }

    return sumVowelsLeft == sumVowelsRight;
  }

  public static void main(String[] args) {
    String str = "eaffuaffeaei";
    System.out.println(sameNumberOfVowels(str));
  }
}
