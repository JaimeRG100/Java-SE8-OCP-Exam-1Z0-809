import java.util.stream.Stream;

public class TestClass {

  public static void main(String[] args) {
    
    // More examples # 1
    { 
      /*
      Stream.generate(() -> "Elsa")
        .filter(n -> n.length() == 4)
        .sorted()
        .limit(2)
        .forEach(System.out::println); 
      */
      // it hangs until you kill the program or it throws an exception after running out of memory
    }
    
    // More examples # 2
    {
      Stream.generate(() -> "Elsa")
        .filter(n -> n.length() == 4)
        .limit(2)
        .sorted()
        .forEach(System.out::println);
    }
    
    // More examples # 3
    {
      /*
      Stream.generate(() -> "Olaf Lazisson")
        .filter(n -> n.length() == 4)
        .limit(2)
        .sorted()
        .forEach(System.out::println);
      */  
      // it hangs until you kill the program 
    }
  }
}
