public class Turkey {
  
  public static void main(String[] args) {
    // You can’t just put any random class in a try-with-resources statement. 
    // Java has no idea how to close a Turkey.
    try (Turkey t = new Turkey()) {   // Does not compile
      System.out.println(t);
    }
  }
}