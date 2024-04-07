public class DemoMethod {

    // static method
    // "void" is a return type, representing is should not return anything.
    public static void main(String[] args) {
        // 1+3
        // 2+5
        int result = 1 + 3;
        int result2 = 2 + 5;

        // call method
        result = sum(1, 3);
        result2 = sum(2, 5);

        sum(1.3, 1.4);
        System.out.println(sum("1", "3"));

        Integer m = 3;
        Integer n = 4;
        if (m > n) {// Wrong in Concept

        }
        if (m.compareTo(n) > 0) {// check if m>n

        }

        // radius -> Circle area
        double pi = Math.PI; // 3.14159...
        double area = area(3.2d);
        double area2 = area("Circle", 3.2d);
        double area3 = area("Square", 3.2d);
        double area4 = calculate("Circle", "area", 3.2d);
        double area5 = calculate("Square", "area", 3.2d);
        double area6 = calculate("Circle", "perimeter", 3.2d);
        double area7 = calculate("Square", "perimeter", 3.2d);
        System.out.println(area);

        // Adult
        int age = 18;
        if (age >= 18) {

        }
        boolean isAdult = isAdult(age);



    }

    // static method
    // "sum" is a method name
    // "(int x, int y)" is declaration of input parameters for methods
    // "int" is also a return type
    // keyword "return": for all non-void scenario
    public static int sum(int x, int y) {
        int z = x + y;
        return z;
    }

    // subtraction
    public static int subtraction(int x, int y) {
        // int z=x-y;
        return x - y; // int value - int value -> int value
    }

    // Method Definition: Method Name + Input Parameter (type & no. of parameter)
    public static double sum(double x, double y) {
        return x + y;
    }

    public static double sum(double x, int y) {
        return x + y;
    }

    public static double sum(int x, double y) {
        return x + y;
    }

    public static int sum(String x, String y) {
        // Integer z = Integer.valueOf(x).intValue() + Integer.valueOf(y).intValue();//convert String to Integer
        // Integer Object -> int value
        return Integer.valueOf(x) + Integer.valueOf(y);// Integer + Integer -> int + int -> int
    }

    public static double area(double r) {
        return r * r * Math.PI;// bug(double cannot +-*/)
    }

    public static double area(String s, double x) {
        // double area=-1.0;
        if ("Circle".equals(s)) {
            return x * x * Math.PI;
        } else if ("Square".equals(s)) {
            return x * x;
        }
        return -1.0;
    }

    public static double calculate(String shape, String target, double x) {
        if ("Circle".equals(shape) && "area".equals(target)) {
            return Math.pow(x, 2) * Math.PI;// bug
        } else if ("Square".equals(shape) && "area".equals(target)) {
            return Math.pow(x, 2);
        } else if ("Circle".equals(shape) && "perimeter".equals(target)) {
            return x * 2 * Math.PI;
        } else if ("Square".equals(shape) && "perimeter".equals(target)) {
            return x * 4;
        }
        return -1.0;
    }

    public static boolean isAdult(int age) {
        //Approach 1:
        // if (age >= 18) {
        //     return true;
        // }
        // return false;

        //Approach 2:
        // return age >= 18 ? true:false;

        //Approach 3:(only using for true/false value)
        return age>=18;
    }



}
