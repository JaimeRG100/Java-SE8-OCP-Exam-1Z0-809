import java.util.Optional;

public class TestClass {
  
  public static Optional<Double> average(int... scores) {
    if (scores.length == 0 ) return Optional.empty();
    int sum = 0;
    for(int i = 0; i < scores.length; i++) 
      sum += scores[i];
    return Optional.of((double) sum / scores.length);
  }
  
  public static void main(String[] args) {
    Optional<Double> opt = average(1, 3, 5, 6);
    opt.ifPresent(System.out::println);
    System.out.println(opt.orElse(0.0));
    System.out.println(opt.orElseGet(() -> new Double(0.0)));
    System.out.println(opt.orElseGet(() -> 0.0));
    System.out.println(opt.orElseThrow(() -> new IllegalStateException()));
    
    System.out.println("- - - - - - - ");
    opt = average();
    opt.ifPresent(System.out::println);
    System.out.println(opt.orElse(0.0));
    System.out.println(opt.orElseGet(() -> new Double(0.0)));
    System.out.println(opt.orElseGet(() -> 0.0));
    //System.out.println(opt.orElseThrow(() -> new IllegalStateException()));
    
    System.out.println("- - - - - - - ");
    opt = null;
    //opt.of(opt);   // throws NullPointerException
    opt = Optional.of(10.1);
    System.out.println(opt.of(opt));   // Optional[Optional[10.1]] 
                                       // of() is a static method that returns an Optional[value[
    System.out.println("- - - - - - - ");
    opt = opt.ofNullable(10.2);
    opt.ifPresent(System.out::println);
    opt = opt.ofNullable(null);
    opt.ifPresent(System.out::println);
    opt = opt.ofNullable(null);
    System.out.println(opt);
    System.out.println(Optional.empty());
    
    System.out.println("- - - - - - - ");
    opt = Optional.of(12.5);
    opt = opt.filter(x -> x > 10);
    opt.ifPresent(System.out::println);  // 12.5 
    opt = opt.filter(x -> x > 15);
    opt.ifPresent(System.out::println);  // no output
    System.out.println(opt);             // Optional.empty 
    System.out.println(Optional.<Double>of(17.1).filter(x -> x < 18));
    System.out.println(Optional.<Double>of(17.1).filter(x -> x > 18));
    System.out.println(Optional.<Double>of(17.1).filter(x -> x < 18).map((x) -> "<<" + x + ">>"));
    System.out.println(Optional.<Double>of(17.1).filter(x -> x > 18).map((x) -> "<<" + x + ">>"));
    
    System.out.println("- - - - - - - ");
    Optional<Optional<Long>> optOpt = Optional.of(Optional.of(1245L));
    System.out.println(optOpt);
    System.out.println(optOpt.flatMap((x) -> x));
  }
}
