public class App {
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

        String[] strings = new String[3];
        strings[0] = "EFmajor";
        strings[1] = "FSmajor";
        strings[2] = "Bminor";
        System.out.println(strings[1]);

    }
}


