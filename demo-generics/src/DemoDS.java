import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class DemoDS {
  public static void main(String[] args) {
    Map<String, StringPrinter> map = new HashMap<>();
    StringPrinter sp = new StringPrinter("hello");
    StringPrinter sp2 = new StringPrinter("world");
    map.put("a", sp);
    map.put("b", sp2);

    Queue<StringPrinter> qs = new LinkedList<>();
    qs.add(sp);
    qs.add(sp2);

    // StringPrinter sp3 = new StringPrinter("xxx");
    // map.put("b", sp3); // key exists, replace value
    // System.out.println(map.size());// 2
    sp2.setData("xxx");
    System.out.println("qs = " + qs);
    map.get("b").setData("zzz");
    System.out.println(map);

  }
}
