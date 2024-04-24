import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {
  public static void main(String[] args) {
    Queue<Integer> integers = new PriorityQueue<>();
    integers.add(12); 
    integers.add(5);
    integers.add(1000);
    integers.add(-2);
    System.out.println(integers.poll()); // every time to poll will triger sorting
    System.out.println(integers.poll());
    System.out.println(integers.poll());

    System.out.println(integers);

  }
}
