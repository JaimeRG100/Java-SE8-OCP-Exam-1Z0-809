public class Auto implements AutoCloseable {
  int num;
  
  Auto(int num) {this.num = num;}
  
  public void close() {
    throw new RuntimeException("rte: " + num);
  }
  
  public static void main(String[] args) {
    try (Auto a1 = new Auto(1); Auto a2 = new Auto(2)) {
      throw new RuntimeException("try rte");
    } catch(Exception e) {
      System.out.println(e.getMessage());
      for(Throwable t: e.getSuppressed())
        System.out.println(t.getMessage());
    } finally {
      System.out.println("finally");
    }
    
  }
}