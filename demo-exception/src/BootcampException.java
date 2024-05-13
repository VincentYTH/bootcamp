public class BootcampException extends Exception {
  // "extends Exception" implies "BootcampException" is a checked exception
  // because Exception.class is a Checked Exception
  public static void main(String[] args) {
    try{
      calculate(10, 2);
      System.out.println("End of Calculate() method");
    } catch (BootcampException e) {
      System.out.println("Exception in Calculate() method, recovery step...");
    } finally {
      System.out.println("finally...");
    }
  }

  public static int divide(int x, int y){
    return x / y; // if y = 0, JVM will throw an object of ArithmeticException
  }

  public static void calculate(int x, int y) throws BootcampException{ // Solution 1
    try {
      divide(x, y);
      } catch (ArithmeticException | IllegalArgumentException e){ // or exception (no and)
        throw new BootcampException(); // because it is a checked exception so we need to handle it before compilation
      }
  }
}
