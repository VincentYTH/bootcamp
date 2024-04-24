import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingDeque;

public class DemoDeque {
  public static void main(String[] args) {
    // Deque extends Queue
    Deque<String> strings = new LinkedList<>();
    strings.add("hello"); // add -> add at last
    strings.add("abc");
    strings.addFirst("ijk");
    System.out.println(strings); // [ijk, hello, abc]

    strings.poll(); // by default is pull first
    strings.pollLast(); // poll the element from tail
    System.out.println(strings); // [hello]

    strings.add("world");
    System.out.println(strings.peek()); // hello

    strings.pop(); // -> remove first
    System.err.println(strings); // [world]
    strings.push("mmm"); // -> add first
    System.out.println(strings); // [mmm, world]

    // stack (pop, push)
    List<String> strings3 = new Stack<>(); // thread-safety
    strings3.add("hello");

    Stack<String> strings4 = new Stack<>();
    strings4.push("hello"); // -> add first
    strings4.push("hello2");
    strings4.push("hello3");
    System.out.println(strings4.pop()); // hello3
    System.out.println(strings4.size()); // 2


    // Queue / Deque -> LinkedList or Array
    Queue<String> qs = new ArrayDeque<>(); // LinkedList / Array
    qs.add("hello");
    qs.add("abc");
    System.out.println(qs.poll()); // hello

    qs.add("x");
    qs.add("y");
    qs.remove();
    System.out.println(qs); // [x, y]

    qs.add("ooo");
    qs.offer("ooo");
    System.out.println(qs); // [x, y, ooo]

    Deque<String> ds = (Deque<String>) qs;
    ds.addFirst("mmm");
    ds.addLast("nnn");
    System.out.println(ds); // [mmm, x, y, nnn]

    Deque<String> ds2 = new LinkedBlockingDeque<>(2);
    ds2.add("a");
    ds2.add("b");
    ds2.offer("c"); // offer insert 失敗時返回 false, add 失敗時直接異常
    ds2.offer("e");
    System.out.println(ds2.size());
  }
}
