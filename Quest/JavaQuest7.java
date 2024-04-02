/**
 * The sum is 55
 */
public class JavaQuest7 {
  // Sum values of an array
  public static void main(String[] args) {
    // Declare a int array, with value 1 to 10
    // code here
    int sum = 0;
    int[] total = new int[]{1,2,3,4,5,6,7,8,9,10};
    for(int i=0; i<total.length; i++){
      sum+=total[i];
    }
    // Write a loop to sum up all value in the int array
    // code here ...
    System.out.println("The sum is " + sum);
  }
}