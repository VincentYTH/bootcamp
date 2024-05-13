public class Basic {
  public static void main(String[] args) {
    // checked exception (compile-time exception)

    // unchecked exception (run-time exception)
    // 1. IllegalArgumentException
    int total = 0;
    try {
      total = totalSalary(new int[] {100, -10, 45});
    } catch (IllegalArgumentException e) {
      total = 0;
    }
    System.out.println("total salary = " + total);

    // 2. ArithmeticException (/ by zero)
    int x = 0;
    int r = x == 0 ? 0 : 8 / x; // java.lang.ArithmeticException: / by zero
    int r2 = 0;
    try {
      r2 = 8 / x;
    } catch (ArithmeticException e) {
      r2 = 0;
      // send sms or email
    }
    System.out.println(r2);

    // 3. ArrayIndexOutOfBoundsException
    try {
      getString(new char[] {'c', 'a', 't'}, -2, 2);
    } catch (ArrayIndexOutOfBoundsException e) {
      // send sms or email
    }

    // 4. NullPointerException
    String s = "hello";
    s = null;
    // Solution 1 (not suggested)
    try {
      System.out.println(s.charAt(0));
    } catch (NullPointerException e) {
      // Nothing to do...
    }
    // Solution 2
    if (s != null)
    System.out.println(s.charAt(0));

    // 5. StringIndexOutOfBoundsException
    String s2 = "hello";
    try {
      System.out.println(s2.charAt(10));
    } catch (StringIndexOutOfBoundsException e) {
      // send sms or email
    }

    // 6. IllegalStateException
    int n1 = 7;
    int n2 = -8;
    try{
      checkParameters(n1, n2);
    } catch (IllegalStateException e) {
      System.out.println("Hand the IllegalStateException");
    }

    // 7. NumberFormatException
    try{
    int num = Integer.parseInt("10");
    } catch (NumberFormatException e) {
      System.out.println("Hand the NumberFormatException");
    }

  }

  public static int totalSalary(int[] arr) {
    int sum = 0;
    for (int x : arr) {
      if (x < 0)
        throw new IllegalArgumentException(); // an error event
      sum += x;
    }
    return sum;
  }

  // ArrayIndexOutOfBoundsException
  public static String getString(char[] characters, int beginIndex,
      int endIndex) {
    StringBuilder sb = new StringBuilder();
    for (int i = beginIndex; i <= endIndex; i++) {
      sb.append(characters[i]);
    }
    return sb.toString();
  }

  public static void checkParameters(int n1, int n2){
    if (n1 + n2 > 0)
      System.out.println("It is correct state");
    if (n1 * n2 >100)
      System.out.println("It is correct state");
    throw new IllegalStateException();
  }
}
