import java.util.concurrent.atomic.*;

public class TestClass {
  
  public String returnValue() { return "Hello"; }

  public static void main(String[] args) {
    AtomicBoolean atomBoolean = new AtomicBoolean(true);
    System.out.println(atomBoolean.get());
    System.out.println("- - - - - ");
    
    AtomicInteger atomInteger = new AtomicInteger(12);
    System.out.println(atomInteger.get());
    
    System.out.println(atomInteger.getAndSet(36));
    System.out.println(atomInteger.get());
    System.out.println(atomInteger.getAndIncrement());
    System.out.println(atomInteger.get());
    System.out.println(atomInteger.incrementAndGet());
    System.out.println(atomInteger.get());
    System.out.println("- - - - - ");
    
    AtomicLong atomLong = new AtomicLong(128479);
    System.out.println(atomLong.get());
    
    AtomicReference<TestClass> atomRef = new AtomicReference<>(new TestClass());
    System.out.println(atomRef.get().returnValue());
    
    
  }
}