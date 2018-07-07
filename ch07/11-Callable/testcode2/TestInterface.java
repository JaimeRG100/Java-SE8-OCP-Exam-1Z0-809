import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.*;

public class TestClass {
  public static void main(String[] args) {

    
    
    Callable<String> c1 = () -> { return new String("ok1");};
    try {
      System.out.println(c1.call());
    } catch (Exception e) {
      System.out.println(e);
    }
    
    
    Caller c2 = new Caller();
    System.out.println(c2.call());
    
    
    
    Callable c3 = new Callable(){
      public Boolean call() {
        System.out.print("...");
        return true;
      }
    };
    try {
      System.out.println(c3.call());
    } catch(Exception e) {
      System.out.println(e);
    }

    
    
  }
}

class Caller implements Callable {
  
  public Integer call() {
    return 3;
  }
  
}