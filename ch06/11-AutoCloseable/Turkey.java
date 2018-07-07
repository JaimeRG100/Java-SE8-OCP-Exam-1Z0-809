public class Turkey implements AutoCloseable{
  
  public void close() {
    System.out.println("Close gate");
  }
  
  public static void main(String[] args) {
    try ( Turkey t = new Turkey()) {
      System.out.println("Put urkeys in");
    }
  }
}