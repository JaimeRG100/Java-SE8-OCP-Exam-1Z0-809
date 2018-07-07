public class JammedTurkeyCage implements AutoCloseable {
  
  public void close() throws IllegalStateException {
    throw new IllegalStateException("Cage door does not close");
  }
  
  public static void main(String[] args) {
    try (JammedTurkeyCage t = new JammedTurkeyCage()) {
      throw new IllegalStateException("turkeys ran off");
    } finally {
      throw new RuntimeException("and we couldn't find them");    // Since line finnaly throws an exception, the previous exception is lost.
    }
    
  }
}