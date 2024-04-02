import java.util.Arrays;

public class DemoArray {
    /**
     * @param args
     */
    public static void main(String[] args) {


        // 9 types = Primitives + String
        // int x=2;
        // Sting s="abc";

        // array = 陣列 (Store a set of same type of values)
        int[] arr = new int[3]; // store <= 3 values
        // Assign value to the array
        arr[0] = 100;
        arr[1] = 2;
        arr[2] = -100;
        // Cannot arr[3] = 100; arr[-1] = 100;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        // Create another int array to the original variable
        arr = new int[4];
        System.out.println(arr[2]);

        arr[0] += 10;
        arr[0] *= 2;
        System.out.println(arr[0]);

        double[] arr2 = new double[2];
        arr2[0] = 1.5;
        arr2[1] = 205.11;
        System.out.println(arr2[1]);

        String[] strings = new String[3];// string array obj.
        strings[0] = "abc";// string obj.
        strings[1] = "hi";
        strings[2] = "xyz";
        System.out.println(strings[0]);

        strings[0] += "def";// -> refersh strings[0] to "abcdef"
        System.out.println(strings[0]);

        strings[1] = strings[2];
        System.out.println(strings[1]);// "xyz"

        strings[1] = "hellp";
        System.out.println(strings[1]);// hellp

        String[] backup = strings;// assign the address of original array to another array variable

        strings = new String[4];
        strings[1] = "help";
        if ("help".equals(strings[1])) {
            System.out.println("Yes");
            System.out.println(strings[0]);// defauat value of string is null
        }

        int[] integers = new int[3];// defauat value of int is 0; boolean is false; char is '\u0000';


        char c3 = 'a';
        System.out.println(c3);
        if (c3 == 97) { // 'a' will convert to int(ASCII code)
            System.out.println("Yes, it is 97.");
        }

        long l = 2200000000L;
        int x = (int) l;// U pick the risk if the l > int limited
        System.out.println("x=" + x);

        short s = 128;
        byte b = (byte) s;
        System.out.println("b=" + b);// -128(overflow)

        // The ways to declare and assign String value
        String s3 = "abc";// "abc" is a String object in heap
        String s4 = new String("abc");// This "abc" is another string object in heap
        String s5 = "abc";// This "abc" object is same as the one in s3
        String s6 = new String("abc");// This "abc" is another new string object

        // The ways to declare and assign String array
        String[] strings2 = new String[3];
        strings2[0] = "hello";
        strings2[1] = "hello";
        strings2[2] = "hello";
        String[] strings3 = new String[] {"hello", "hello", "hello"};// imply the length = 3
        String[] strings4 = {"hello", "hello", "hello"};// imply you have to assign an string array object

        for (int i = 0; i < strings2.length; i++) {
            System.out.println(strings2[i]);
        }

        // Example 1: loop for print out odd no.
        int[] integers2 = new int[] {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < integers2.length; i++) {
            if (integers2[i] % 2 == 1) {
                System.out.println(integers2[i]);
            }
        }

        // average value of even no.
        int total = 0;
        int evenNo = 0;
        for (int i = 0; i < integers2.length; i++) {
            if (integers2[i] % 2 == 0) {
                total += integers2[i];
                evenNo++;
            }
        }
        System.out.println("The average value is " + (double) total / evenNo);

        // Find the max value within the int array
        int max = Integer.MIN_VALUE;// The Min.Value of Int
        for (int i = 0; i < integers2.length; i++) {
            if (integers2[i] > max) {
                max = integers2[i];
            }
        }
        System.out.println("The max value is " + max);

        // Find the min value within the int array
        int min = Integer.MAX_VALUE;// The Max.Value of Int
        for (int i = 0; i < integers2.length; i++) {
            if (integers2[i] < min) {
                min = integers2[i];
            }
        }
        System.out.println("The min value is " + min);

        // Searching
        char[] characters = new char[] {'a', 'b', 'c', '!'};
        // Check if the array contains char'!' -> true / false
        boolean result = false;
        for (int i = 0; i < characters.length; i++) {
            if ('!' == characters[i]) {
                result = true;
                break;
            }
        }
        System.out.println(result);

        // Print out the first index of '!', if not then print -1
        int index = -1;
        for (int i = 0; i < characters.length; i++) {
            if ('!' == characters[i]) {
                index = i;
                break;
            }
        }
        System.out.println(index);

        // Store all index of '!' in another array -> 2,4
        char[] characters2 = new char[] {'a', 'b', '!', 'c', '!'};
        int[] indexes = new int[characters2.length];
        int j = 0;
        for (int i = 0; i < characters2.length; i++) {
            if ('!' == characters2[i]) {
                indexes[j] = i;
                j++;
            }
        }
        System.out.println(Arrays.toString(indexes));

        String[] balls = new String[] {"Red", "Yellow", "Black", "Yellow"};
        double[] prices = new double[] {5.5, 7.8, 10.0, 7.8};
        int[] quantities = new int[] {1, 3, 4, 5};
        // Find the total amuont of Yellow balls(Price*Qty.) -> 7.8*3=+7.8*5
        double amount = 0;
        int q = 0;
        for (int i = 0; i < balls.length; i++) {
            if ("Yellow".equals(balls[i])) {
                amount += prices[i] * quantities[i];// double value * int value -> double value
            }
        }
        System.out.println(amount);


    }
}
