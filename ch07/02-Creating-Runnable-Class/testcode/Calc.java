public class Calc implements Runnable {
  public void run() {
    System.out.println("run");}
  public static void main(String[] agrs) {
    new Thread(new Calc()).start(); // thread
    new Calc().run(); //not a thread
  } } 