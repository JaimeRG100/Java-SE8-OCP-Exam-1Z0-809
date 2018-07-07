import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class TestClass {
  public static void main(String[] args) {
    {
      List<String> list = Stream.of("follow your heart and your fellings".split(" ")).collect(Collectors.toCollection(ArrayList::new));
      System.out.println(list);
      Set<String> set = Stream.of("follow your heart and your fellings".split(" ")).collect(Collectors.toCollection(TreeSet::new));
      System.out.println(set);
      System.out.println("- - - - -");
    }
    
    {
      String frenchCounting = "un:deux:trois:quatre";
      List<String> list = Stream.of(frenchCounting.split(":"))
        .collect(Collectors.toList());
      System.out.println(list);
      System.out.println("- - - - -");
    }
    
    {
      String []roseQuote = "a rose is a rose is a rose".split(" ");
      Set<String> words = Arrays.stream(roseQuote).collect(Collectors.toSet());
      words.forEach(System.out::println);
      System.out.println("- - - - -");
    }
    
    {
      Map<String, Integer> nameLength = Stream.of("Arnold", "Alois", "Schwarzenegger")
        .collect(Collectors.toMap(name -> name, name -> name.length()));
      nameLength.forEach((name, len) -> System.out.println(name + " >> " + len));
      System.out.println("- - - - -");
    }
    
    {
      Stream.of("Arnold", "Alois", "Schwarzenegger")
        .collect(Collectors.toMap( name -> name, name -> name.length()))
        .forEach((name, len) -> System.out.println(name + " >> " + len));
      System.out.println("- - - - -");
      
      Stream.of("Arnold", "Alois", "Schwarzenegger")
        .collect(Collectors.toMap( Function.identity(), name -> name.length()))
        .forEach((name, len) -> System.out.println(name + " >> " + len));
      System.out.println("- - - - -");
    }
    
    {
      String []roseQuote = "a rose is a rose is a rose".split(" ");
      Set words = Arrays.stream(roseQuote).collect(Collectors.toCollection(TreeSet::new));
      words.forEach(System.out::println);
      System.out.println("- - - - -");
    }
    
    {
      String []string= "you never know what you have until you clean your room".split(" ");
      Stream<String> distinctWords = Arrays.stream(string).distinct();
      Map<Integer, List<String>> wordGroups =distinctWords.collect(Collectors.groupingBy(String::length));
      wordGroups.forEach( (count, words) -> {
        System.out.println("words of lenght: " + count);
        System.out.println("_____________________");
        words.forEach(System.out::println);
      });
      System.out.println("- - - - -");
    }
    
    {
      String []string= "you never know what you have until you clean your room".split(" ");
      Stream<String> distinctWords = Arrays.stream(string).distinct();
      Map<Boolean, List<String>> wordsBlocks = distinctWords.collect( 
         Collectors.partitioningBy(w -> w.length() > 4));
      System.out.println("Long words (len > 4): " + wordsBlocks.get(true) );
      System.out.println("Short words (len <= 4): " + wordsBlocks.get(false) );
    }
  }
}
/*

*/