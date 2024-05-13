public class App {
    public static void main(String[] args) throws Exception {

        int result = 1;
        for (int i = 1; i <= 5; i++){
            result *= i;
        }
        System.out.println(result);
        System.out.println(multiply(5));
        System.out.println(add(5));
        System.out.println(addEven(100));
        System.out.println(fibonacci(4));
    }

    public static int multiply(int n){
        // base case (exit criteria)
        if (n == 1)
        return 1;
        return n * multiply(n - 1);
        // 5 * (5-1) -> waiting release 4 (When put (5-1) to mutiply(), we are waiting an int value returned)
            // 4 * (4-1) -> waiting release 3
                // 3* (3-1) -> waiting release 2
                    // 2* (2-1) -> waiting release 1
                        // 1 -> return 1
    }

    public static int add(int n){
        if (n == 1)
        return 1;
        return n + add(n - 1);
    }

    public static int addEven(int n){
        if (n == 2)
        return 2;
        return n + addEven(n - 2);
    }

    public static int fibonacci(int n){
        if (n <= 2)
        return n - 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
