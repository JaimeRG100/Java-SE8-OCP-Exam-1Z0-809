public class PrintData implements Runnable {
  
  public void run() {
    for (int i = 0; i<3; i++)
      System.out.println(i);
  }

  public static void main(String[] agrs) {
    new Thread(new PrintData()).start();
  }
}