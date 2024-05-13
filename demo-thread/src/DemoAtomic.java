import java.util.concurrent.atomic.AtomicInteger;

public class DemoAtomic {
  
  static AtomicInteger x = new AtomicInteger(17);

  public static void main(String[] args) {
    int result = x.incrementAndGet();
    System.out.println(result); // 18

    Long startTime = System.currentTimeMillis();
    Runnable task = () -> {
      for (int i = 0; i < 1_000_000; i++){
        x.incrementAndGet();
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
    
    System.out.println(x);
    System.out.println(endTime - startTime);
  }
}
