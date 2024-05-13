import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class DemoConcurrentQueue {

  static Queue<Character> characters = new ConcurrentLinkedQueue<>();

  public static void main(String[] args) {
    Long startTime = System.currentTimeMillis();

    Runnable concatLinkedList = () -> {
      for (int i = 0; i < 10_000_000; i++){
        characters.add('s');
      }
    };

    Thread th1 = new Thread(concatLinkedList);
    Thread th2 = new Thread(concatLinkedList);
    th1.start();
    th2.start();

    try {
      th1.join();
      th2.join();
    } catch (InterruptedException e){}

    Long endTime = System.currentTimeMillis();

    System.out.println(characters.size()); // 2_000_000
    System.out.println(endTime - startTime);
  }
}
