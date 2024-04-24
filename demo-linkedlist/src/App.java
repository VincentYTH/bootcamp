import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("hello");
        strings.add("abc");
        System.out.println(strings.size()); // 2

        strings.remove(1);
        System.out.println(strings);
        System.err.println(strings.contains(new String("hello"))); // true

        // ArrayList methods != LinkedList methods
        // ArrayList and LinkedList has its own methods

        List<String> ls = new LinkedList<>();
        ls.add("abc");
        ls.add("def");
        ls.add("hij");
        for (int i = 0; i < ls.size(); i++){ // for loop
            System.out.println(ls.get(i)); // get -> for loop
        }

        for (String s : ls){ // next
            if ("def".equals(s)) {
                System.out.println("this is def");
            }
        }

        LinkedList<String> ll = new LinkedList<>();
        ll.add("hello"); // add = addLast
        ll.addLast("abc");
        ll.addFirst("Jenny");
        System.out.println(ll);

        ArrayList<String> as = new ArrayList<>();
        as.add("hello");
        as.add("ijk");
        as.add("def");
        as.remove(1);
        System.out.println(as);
    }
}
