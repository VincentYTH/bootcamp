public class Calculator {
  public static int x = 17;
  
  public synchronized static void addOne(){ // synchronized -> to solve non-thread safety
    x++;
  }

  public static void main(String[] args) {
    Long startTime = System.currentTimeMillis();
    Runnable increment = () -> {
      for (int i = 0; i < 10_000_000; i++){
      // Calculator.x++; // non thread-safe
      addOne();
      }
    };

    Thread th1 = new Thread(increment);
    Thread th2 = new Thread(increment);
    th1.start();
    th2.start();


    try{
    th1.join();
    th2.join();
    } catch (InterruptedException e){
      
    }
    
    Long endTime = System.currentTimeMillis();
    System.out.println(endTime - startTime);
    System.out.println(Calculator.x);
  }
}
