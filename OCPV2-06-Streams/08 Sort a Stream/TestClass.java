import java.util.stream.*;
import java.util.*;

public class TestClass {
  public static void main(String[] args) {
    {
      Arrays.asList("follow your heart but take your brain with you".split(" "))
        .stream()
        .distinct()
        .sorted()
        .forEach(System.out:: println);
      System.out.println("- - - - - - ");
      
      Comparator<String> lengthCompare = (str1, str2) -> str1.length() - str2.length();
      Arrays.asList("follow your heart but take your brain with you".split(" "))
        .stream()
        .distinct()
        .sorted(lengthCompare)
        .forEach(System.out::println);
      System.out.println("- - - - - - ");
      
      Arrays.asList("follow your heart but take your brain with you".split(" "))
        .stream()
        .distinct()
        .sorted(lengthCompare.thenComparing(String::compareTo))
        .forEach(System.out::println);
      System.out.println("- - - - - - ");
      
      Arrays.asList("follow your heart but take your brain with you".split(" "))
        .stream()
        .distinct()
        .sorted(String::compareTo)
        .sorted(lengthCompare)      // mine test
        .forEach(System.out::println);
      System.out.println("- - - - - - ");
      
      Arrays.asList("follow your heart but take your brain with you".split(" "))
        .stream()
        .distinct()
        .sorted(lengthCompare.thenComparing(String::compareTo).reversed())
        .forEach(System.out::println);
      System.out.println("- - - - - - ");
      
      Dummy dummy = new Dummy() {
        public int compare(String s1, String s2) {
          return s1.length() - s2.length();
        }
      };
      Arrays.asList("follow your heart but take your brain with you".split(" "))
        .stream()
        .distinct()
        .sorted(dummy)
        .forEach(System.out::println);;
    }
  }
}

interface Dummy extends Comparator<String> {
  public int compare(String s1, String s2);
}