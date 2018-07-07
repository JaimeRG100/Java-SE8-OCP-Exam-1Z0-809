public class JammedTurkeyCage implements AutoCloseable {
  
  public void close() throws IllegalStateException {
    throw new IllegalStateException("Cage door does not close");
  }
  
  public static void main(String[] args) {
    try (JammedTurkeyCage t1 = new JammedTurkeyCage(); 
         JammedTurkeyCage t2 = new JammedTurkeyCage()) {
      System.out.println("turkeys entered cage");
    } catch (IllegalStateException e) {
      System.out.println("caught: " + e.getMessage());
      for(Throwable t: e.getSuppressed())
        System.out.println(t.getMessage());
    }
  }
}