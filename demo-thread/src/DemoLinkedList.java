import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {

  static List<Character> characters = new LinkedList<>();

  public static void main(String[] args) {

    Long startTime = System.currentTimeMillis();

    Runnable concatLinkedList = () -> {
      for (int i = 0; i < 1_000_000; i++){
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

    System.out.println(characters.size()); // 1378834 of 2_000_000
    System.out.println(endTime - startTime);
  }
}
