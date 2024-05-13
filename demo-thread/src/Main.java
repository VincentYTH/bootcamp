public class Main {
  public static void main(String[] args) {
    // 3 threads
    // 1. main thread
    // 2. th1
    // 3. th2

    // Approach 1: A class to implement Runnable interface (Thread constructor)
    Task task = new Task();

    // Approach 2: Lambda to create a runnable object (Thread constructor)
    Runnable taks2 = () -> {
      System.out.println("I am a taks2 and running");
    };

    // Approach 3: MyThread extends Thread
    MyThread myThread = new MyThread();
    myThread.start(); // My thread is running...

    Thread th1 = new Thread(task);
    th1.start(); // trigger run method()

    Thread th2 = new Thread(taks2);
    th2.start();

    System.out.println("Main end...");
  }
}
