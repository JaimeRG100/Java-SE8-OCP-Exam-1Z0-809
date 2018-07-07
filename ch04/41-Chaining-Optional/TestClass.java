import java.util.Optional;

public class TestClass {
  
  // Prints the number only if it is a three-digit 
  private static void threeDigit(Optional<Integer> optional) {
    if(optional.isPresent()) {          // outer if
      Integer num = optional.get();
      String string = "" + num;
      if(string.length() == 3)          // inner if
        System.out.println(string);
    }
  }
  
  // Prints the number only if it is a three-digit (functional programming)
  private static void threeDigitFP(Optional<Integer> optional) {
    optional.map(n -> "" + n)          // part 1
      .filter(s -> s.length() == 3)    // part 2
      .ifPresent(System.out::println); // part 3    
  }

  public static void main(String[] args) {
    // testing the previous methods
    Optional<Integer> opt = Optional.of(234);
    threeDigit(opt);     // print 234
    threeDigitFP(opt);   // print 234
    opt = Optional.of(34);
    threeDigit(opt);     // doesn't print anything
    threeDigitFP(opt);   // doesn't print anything
    
    // test code
    System.out.println("- - - - - ");
    Optional<Integer> optional = Optional.of(23);
    optional.map(z -> z + 5);
    optional.filter(n -> n > 30);
    optional.ifPresent(System.out::println);
    
    System.out.println("- - - - - ");
    optional = Optional.of(23)
      .map(z -> z + 10)
      .filter(n -> n > 30);
    optional.ifPresent(System.out::println);
    
    System.out.println("- - - - - ");
    optional = Optional.empty();
    optional.map(x -> x + 1);
    System.out.println(optional);
    System.out.println(Optional.ofNullable(null));
    System.out.println(Optional.of(Optional.empty()));
    

 }
}
