import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemoQueue {

  public static void main(String[] args) {
    // Queue is a contract / interface
    List<String> strings = new LinkedList<>();
    strings.add("hello");
    strings.remove(0);
    strings.add("def");

    Queue<String> strings2 = (Queue<String>) strings;
    strings2.add("abc");
    System.out.println(strings2.size()); // 2

    System.out.println(strings2.poll()); // def -> (poll() means remove and return the head object)
    System.out.println(strings2); // abc
    System.out.println(strings2.poll()); // abc
    System.out.println(strings2.poll()); // null

    strings2.add("xyz");
    strings2.add("ijk");
    System.out.println(strings2.peek()); // xyz -> return the head object without removal

    // while loop (loop -> remove object and read object)
    while (!strings2.isEmpty()) {
      System.out.println(strings2.poll());
    }
    System.out.println(strings2.size()); // 0

    strings2.add("Vincent");
    strings2.add("Oscar");

    // Remove even number
    Queue<Integer> integers = new LinkedList<>();
    integers.add(1);
    integers.add(101);
    integers.add(2);
    integers.add(99);
    integers.add(-8);

    Queue<Integer> integers2 = integers; // backup??

    int size = integers.size();
    int val = -1;
    while (size-- > 0) {
      val = integers.poll();
      if (val % 2 == 1)
        integers.add(val);
    }
    System.out.println(integers);

    // int originSize = integers.size();
    // for (int i = 0; i < originSize; i++) {
    //   int num = integers.peek();
    //   if (Math.abs(num) % 2 == 1) {
    //     integers.poll();
    //     integers.add(num);
    //   } else {
    //     integers.poll();
    //   }
    // }
    // System.out.println(integers);

    System.out.println(integers2.size()); // 3 -> changed as "integers" since pass by reference

    System.out.println(integers.remove()); // 1 , it can remove the head if this queue is not empty
    System.out.println(integers); // [101, 99]
    System.out.println(integers.remove());
    System.out.println(integers.remove());
    System.out.println(integers.size()); // 0

    System.out.println(integers.add(2000)); // true
    System.out.println(integers.add(1000)); // treu
    System.out.println(integers.remove(1000)); // true
    System.out.println(integers.remove(1500)); // false, can be identified because Integer.Class has override equals()
    
    

    int[] arr = new int[] {2, 1, 3};
    int[] backupArr = Arrays.copyOf(arr, arr.length);
    arr[1] = 100;
    System.out.println(Arrays.toString(arr)); // [2, 100, 3]
    System.out.println(Arrays.toString(backupArr)); // [2, 1, 3]

  }
}
