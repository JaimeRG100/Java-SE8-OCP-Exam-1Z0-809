import java.util.Optional;

public class TestClass {
  
  public static Optional<Double> average(int ... scores) {
    if (scores.length == 0) return Optional.empty();
    int sum = 0;
    for(int i=0; i<scores.length; i++) sum += scores[i];
    return Optional.of((double) sum / scores.length);
  }

  public static void main(String[] args) {
    Optional<Double> opt = average(90, 100);   
    opt.ifPresent(System.out::println);
    
    /*Optional*/ opt = average();
    System.out.println(opt.orElse(Double.NaN));
    System.out.println(opt.orElseGet(() -> Math.random()));
    try {
      System.out.println(opt.orElseThrow(() -> new IllegalStateException())); }
    catch(Exception e) {
      System.out.println(e); }
    
    //System.out.println(opt.orElseGet(() -> new IllegalStateException()));  // Does not compile <Double> ~ <Exception>
    
    /*Optional*/ opt = average(90, 100);
    System.out.println(opt.orElse(Double.NaN));
    System.out.println(opt.orElseGet(() -> Math.random()));
    System.out.println(opt.orElseThrow(() -> new IllegalStateException()));
    
  }
}
