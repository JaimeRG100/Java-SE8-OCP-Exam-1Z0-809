import java.util.Optional;
import java.util.List;
import java.util.ArrayList;

public class TestClass {
  
  public static Optional<Double> average(int... scores) {
    if (scores.length == 0) return Optional.empty();
    int sum = 0;
    for(int i=0; i< scores.length; i++) sum += scores[i];
    return Optional.of((double) sum / scores.length);
  }
  
  
  
  public static Optional<List<String>> textToList(String text) {
    if (text.length() == 0) return Optional.empty();
    List<String> list = new ArrayList<>();
    for(int i=0; i<text.length(); i++) list.add(text.substring(i,i+1));
    return Optional.of(list);
  }
  
  public static void main(String[] args) {
    Optional<Double> opt = average(8, 7, 8, 6);
    opt.ifPresent(System.out::println);
    
    opt = average(new int[] {9, 8, 9});
    opt.ifPresent(System.out::println);
    
    opt = average();
    opt.ifPresent(System.out::println);
    
    Optional<List<String>> optList = textToList("Hello how are you?");
    List<String> list = new ArrayList<>(); 
    if(optList.isPresent()) 
      list = optList.get();
    System.out.println(list);
    
    opt = average();
    opt.ifPresent(System.out::println);
    System.out.println(opt.orElse(Double.NaN));
    System.out.println(opt.orElseGet(() -> Math.random()));
    System.out.println(opt.orElseThrow(() -> new IllegalStateException()));
    
    /*
    opt = average();
    System.out.println(opt.orElse(Double.NaN));
    System.out.println(opt.orElseGet(() -> Math.random()));
    try {
      System.out.println(opt.orElseThrow(() -> new IllegalStateException())); }
    catch(Exception e) {
      System.out.println(e); }
    
    //System.out.println(opt.orElseGet(() -> new IllegalStateException()));  // Does not compile <Double> ~ <Exception>
    
    opt = average(90, 100);
    System.out.println(opt.orElse(Double.NaN));
    System.out.println(opt.orElseGet(() -> Math.random()));
    System.out.println(opt.orElseThrow(() -> new IllegalStateException()));
    */
  }
  
}