import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class TestClass {
  public static void main(String[] args) {
    {
      String []string= "you never know what you have until you clean your room".split(" ");
      Stream<String> distinctWords = Arrays.stream(string).distinct();
      distinctWords.forEach(System.out::println);
      System.out.println("- - - - -");
      
      string= "you never know what you have until you clean your room".split(" ");
      Arrays.stream(string)
      .map(word -> word.split(""))
      .distinct()
      .forEach(System.out::println);
      System.out.println("- - - - -");
      
      string= "you never know what you have until you clean your room".split(" ");
      Arrays.stream(string)
      .map(word -> word.split(""))
      .flatMap(arr -> Arrays.stream(arr))
      .distinct()
      .forEach(System.out::print);
      System.out.println();
      System.out.println("- - - - -");
      
      
      string= "you never know what you have until you clean your room".split(" ");
      Arrays.stream(string)
      .flatMap(word -> Arrays.stream(word.split("")))
      .distinct()
      .forEach(System.out::print);
      System.out.println();
      System.out.println("- - - - -");
    }
    
    {
      List<Integer> integers = Arrays.asList(1,2,3,4,5);
      integers.stream()
        .map(i -> i *i)
        .forEach(System.out::println);
      System.out.println("- - - - -");
      
      List<List<Integer>> intsOfInts = Arrays.asList(
         Arrays.asList(1, 3, 5),
         Arrays.asList(2, 4));
      intsOfInts.stream()
        .flatMap(list -> list.stream())
        .sorted()
        .map(i -> i*i)
        .forEach(System.out::println);        
    }
  }
}
/*

*/