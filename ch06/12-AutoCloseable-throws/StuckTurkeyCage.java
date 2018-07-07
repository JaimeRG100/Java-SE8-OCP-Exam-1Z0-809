public class StuckTurkeyCage implements AutoCloseable {
  
  public void close () throws Exception {
    throw new Exception("Cage door does not close");
  }
  
  public static void main(String[] args) {
    try (StuckTurkeyCage t = new StuckTurkeyCage()) { // Does not compile
      System.out.println("put turkeys in");
    }
  }
}