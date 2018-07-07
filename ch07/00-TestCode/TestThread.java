public class TestThread implements Runnable {
  
  public void run() {
    System.out.println("Hello thread");
  }
  
  public static void main(String[] args) {
    new Thread(new TestThread()).start();
  }
}