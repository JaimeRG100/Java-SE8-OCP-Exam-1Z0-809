import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
import java.util.stream.*;
import java.io.*;

class TestAtomic {
  

  public static void main(String[] args) {
    AtomicInteger i = new AtomicInteger(0);

    System.out.println(i);
    i.set(2);
    System.out.println(i.get());
    System.out.println(i.getAndSet(5));
    System.out.println("getAndIncrement: " + i.getAndIncrement() + ", " + i.get());
    System.out.println("incrementAndGet: " + i.incrementAndGet() + ", " + i.get());
    System.out.println("getAndDecrement: " + i.getAndDecrement() + ", " + i.get());
    System.out.println("decrementAndGet: " + i.decrementAndGet() + ", " + i.get());
    
  }
}