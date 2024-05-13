public class DemoString {
  static String str = new String();

  public static void main(String[] args) {
    Long startTime = System.currentTimeMillis();
    Runnable task = () -> {
      String str2 = new String();
      for (int i = 0; i < 1_000_000; i++){
        str = str2.concat("s");
      }
    };

    Thread th1 = new Thread(task);
    Thread th2 = new Thread(task);
    th1.start();
    th2.start();
    
    try {
      th1.join();
      th2.join();
    } catch (InterruptedException e){}

    Long endTime = System.currentTimeMillis();
    
    System.out.println(str.length());
    System.out.println(endTime - startTime);
  }
}
