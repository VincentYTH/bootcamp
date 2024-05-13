import java.util.ArrayList;
import java.util.List;

public class Printer<T> {

  private T data;

  public Printer(T data){
    this.data = data;
  }

  public void print(){
    System.out.println(data.toString()); // T -> object.class
  }

  public static void main(String[] args) {
    // Generics Java since 1.5
    Printer<String> ps = new Printer<>("hello");
    Printer<Integer> pi = new Printer<>(10);
    ps.print(); // String.class -> toString()
    pi.print();

    List<String> ls = new ArrayList<>();
    ls.add("abc");
    
  }

}
