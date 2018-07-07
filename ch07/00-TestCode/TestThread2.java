public class TestThread2 extends Thread {
  
  public void run() {
    System.out.println("Hello thread");
  }
  
  public static void main(String[] args) {
    new Thread(new TestThread2()).start();
    
    try {
      Thread.sleep(3000);
    } catch(InterruptedException e) {
      System.out.println(e);
    }
    
    new Thread(() -> System.out.println("Thread 3")).start();
  }
}