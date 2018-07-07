import java.util.stream.IntStream;
import java.util.stream.DoubleStream;
import java.util.IntSummaryStatistics;
import java.util.DoubleSummaryStatistics;
import java.util.LongSummaryStatistics;
import java.util.OptionalInt;

public class TestClass {
  
  private static int max(IntStream ints) {
    OptionalInt optional = ints.max();
    return optional.orElseThrow(RuntimeException::new);
  }
  
  private static int range(IntStream ints) {
    IntSummaryStatistics stats = ints.summaryStatistics();
    return stats.getMax()-stats.getMin();    
  }
  
  public static void main(String[] args) {
    // test code
    IntStream intStream = IntStream.generate(() -> 3).limit(5);
    System.out.println(max(intStream));
    
    IntStream intRange = IntStream.rangeClosed(1, 5);
    System.out.println(range(intRange));
    
    IntStream.rangeClosed(1, 5).forEach((x) -> System.out.print(x + ", "));
    System.out.println();
    
    IntSummaryStatistics ins = IntStream.range(1,6).summaryStatistics();
    System.out.println("min: " + ins.getMax() + ",  max: " + ins.getMin() + ", sum: " + ins.getSum() + ", avg: " + ins.getAverage() + ", count: " + ins.getCount());
    
    DoubleSummaryStatistics dsm = DoubleStream.of(1.3, 2.4, 3.1).summaryStatistics();
    System.out.println("min: " + dsm.getMax() + ",  max: " + dsm.getMin() + ", sum: " + dsm.getSum() + ", avg: " + dsm.getAverage() + ", count: " + dsm.getCount());
  }
}