import java.util.concurrent.*;

public class TestClass {

  public static void main(String[] args) {
    try {
      Callable callable;
      callable = () -> 5;
      System.out.println(callable.call());
      callable = () -> "The" +  "Zoo";
      System.out.println(callable.call());
      callable = () -> {System.out.println("Giraffe"); return 10;};      
      System.out.println(callable.call());
    } catch(Exception e) {}
  }
}