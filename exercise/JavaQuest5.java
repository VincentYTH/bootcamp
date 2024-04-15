package exercise;
public class JavaQuest5 {
  /**
   * 
   * When target = 'c', the expected output: We found 3 character c in the String.
   * 
   * When target = 'z', the expected output: Not Found.
   */
  // Count the target of character in a String.
  public static void main(String[] args) {
    String str = "Welcome to the coding bootcamp."; // You should not change this line
    char target = 'c';
    int CountC = 0;// Update this target to test the logic

    // Use a loop to count the target of character in a String.
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == target) {
        ++CountC;
      } // code here ...
    }
    if (CountC > 0) {
      System.out.println(
          "We found " + CountC + " character " + target + " in the String.");// if found, print "We found 3 character c in the String."
    } else {
      System.out.println("Not Found");// if not found, print "Not Found."
      // code here ...
    }
  }
}
