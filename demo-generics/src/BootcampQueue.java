import java.util.LinkedList;
import java.util.Queue;

public class BootcampQueue<T> {

  private Queue<T> data;
  private Object data2;

  public BootcampQueue(){
    this.data = new LinkedList<>();
  }

  public void add(T str){ // Object can be anything while T can only be one thing
    this.data.add(str);
  }

  public void add2(Object data2){
    this.data2 = data2;
  }

  public T poll(){
    return this.data.poll();
  }

  // @Override
  // public Queue<T> toString(){
  //   return data;
  // }

  public static void main(String[] args) {
    BootcampQueue<String> bq = new BootcampQueue<>();
    bq.add("hello");
    bq.add2(3); // compile time type check (Object)
    bq.add2("ll");
    System.out.println(bq);
  }
}