import java.util.Hashtable;
import java.util.Map;

public class DemoHashTable {
  // Hashtable -> Thread-safe
  // HashMap -> non Thread-safe

  static Map<Integer, Integer> integers = new Hashtable<>();

  public static void main(String[] args) {
    Long startTime = System.currentTimeMillis();
    Runnable addRunnable = () -> {
      for (int i = 0; i < 1_000_000; i++){
        integers.put(i, i);
      }
    };

    Runnable addRunnable2 = () -> {
      for (int i = 0; i < 1_000_000; i++){
        integers.put(i + 1_000_000, i);
      }
    };

    Thread th1 = new Thread(addRunnable);
    Thread th2 = new Thread(addRunnable2);
    th1.start(); 
    th2.start();

    try {
      th1.join();
      th2.join();
    } catch (InterruptedException e){}

    Long endTime = System.currentTimeMillis();

    System.out.println(integers.size()); // 2_000_000
    System.out.println(endTime - startTime);
  }
}
