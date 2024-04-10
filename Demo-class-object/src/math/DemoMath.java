package math;

public class DemoMath {
  public static void main(String[] args) {
    //Math.pow()
    //Math.pow(1, 2);//upcast
    int base = 2;
    double result = Math.pow(2.0d, 3);//計算平方..次方..
    System.out.println(result);//8.0

    int a = 10;
    int b = 9;
    int min = Math.min(a, b);
    System.out.println(min);//9
    int max = Math.max(a, b);
    System.out.println(max);//10

    double data = -3.2;
    double r = Math.abs(data);//求絕對值
    System.out.println(r);//3.2

    System.out.println(Math.round(3.45));//3
    System.out.println(Math.round(3.50));//4

    System.out.println(Math.sqrt(36));//6.0 (6*6=36)..開方

    System.out.println("ceil = " + Math.ceil(3.1));//4.0
    System.out.println("floor = " + Math.floor(3.7));//3.0

    double radians = 3.333;
    double sinValue = Math.sin(radians);
    double cosValue = Math.cos(radians);
    double tanValue = Math.tan(radians);

    int[] arr = new int[]{10, 4, 20, 3};
    int maxx = Integer.MIN_VALUE;
    for (int i=0; i<arr.length; i++){
      maxx = Math.max(arr[i], maxx);
    }
    System.out.println("max value = " + maxx);//20

    int minn = Integer.MAX_VALUE;
    for (int i=0; i<arr.length; i++){
      minn = Math.min(arr[i], minn);
    }
    System.out.println("min value = " + minn);//3
  }
}
