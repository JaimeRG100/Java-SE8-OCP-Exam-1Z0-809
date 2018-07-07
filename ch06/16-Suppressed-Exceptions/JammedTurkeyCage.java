public class JammedTurkeyCage implements AutoCloseable {
  
  public void close() throws IllegalStateException {
    throw new IllegalStateException("Cage door does not close");
  }
  
  public static void main(String[] args) {
    try (JammedTurkeyCage t = new JammedTurkeyCage()) {
      throw new RuntimeException();           // Primary Exception is not caught
    } catch (IllegalStateException e) {
      System.out.println("caught: " + e.getMessage());
    }
  }
}