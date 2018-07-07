import java.util.Arrays;

public class TestClass {
  public static void main(String[] args) {
    
    // For serial streams, using an unordered version has no effect
    Arrays.asList(1,2,3,4,5,6).stream().unordered().forEach((s) -> System.out.print(s + " "));
    System.out.println();
    
    // For parallel streams, using an unordered version, the results can greatly improve performance
    Arrays.asList(1,2,3,4,5,6).stream().unordered().parallel().forEach((s) -> System.out.print(s + " "));
    System.out.println();
    
    // test code
    Arrays.asList(1,2,3,4,5,6).stream().parallel().unordered().forEach((s) -> System.out.print(s + " "));
    System.out.println();
    
  }
}