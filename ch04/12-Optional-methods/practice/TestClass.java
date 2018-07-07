import java.util.Optional;

public class TestClass {
  
  public static Optional<Double> average(int... score) {
    if(score.length == 0) return Optional.empty();
    int sum = 0;
    for(int i = 0; i < score.length; i++) {
      sum += score[i];
    }
    return Optional.of((double) sum / score.length);
  }

  public static void main(String[] args) {   
    Optional<Double> opt = average();
    if(opt.isPresent()) System.out.println(opt.get());
    opt.ifPresent(System.out::println);
    System.out.println(opt.orElse(Double.NaN));
    System.out.println(opt.orElseGet(() -> Math.random()));
    //System.out.println(opt.orElseThrow(() -> new IllegalStateException()));
    System.out.println("- - - - ");
    
    opt = average(100, 95, 96, 98);
    if(opt.isPresent()) System.out.println(opt.get());
    opt.ifPresent(System.out::println);
    System.out.println(opt.orElse(Double.NaN));
    System.out.println(opt.orElseGet(() -> Math.random()));
    System.out.println(opt.orElseThrow(() -> new IllegalStateException()));
    
  }
}
