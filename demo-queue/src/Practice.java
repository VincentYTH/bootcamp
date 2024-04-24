import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Practice implements Comparator<Integer>{

  // Compare two integers with the first digit, compare value while their first digits are same
  @Override
  public int compare(Integer a, Integer b){
    int fristDigitA = a.toString().charAt(0);
    int fristDigitB = b.toString().charAt(0);
    
    if (fristDigitA != fristDigitB) {
      return Integer.compare(fristDigitB, fristDigitA);
    } else {
      return Integer.compare(b, a);
    }
  }

  public static void main(String[] args) {
    Queue<Integer> pq = new PriorityQueue<>(new Practice());
    pq.add(5);
    pq.add(11);
    pq.add(333);
    pq.add(9);
    pq.add(2000);
    pq.add(102);
    
    while (!pq.isEmpty()) {
      System.out.print(pq.poll() + " ");
    }
  }
}
