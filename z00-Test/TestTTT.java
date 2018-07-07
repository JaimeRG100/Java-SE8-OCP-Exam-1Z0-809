import java.util.*;
import java.sql.*;
import java.io.*;
import java.util.stream.*;
import java.util.concurrent.*;

public class TestTTT {
  
  public static void main(String[] args) {
    
    Stream<String> stream = Stream.of("hello","zoo" , "allo");
    
    System.out.println(stream.max(String::compareTo).orElse("No values found!!"));
    stream = Stream.empty();
    System.out.println(stream.max(String::compareTo).orElse("No values found!!"));
    
    
    List<String> list = Arrays.asList("hello","zoo" , "allo");
    System.out.println(list);
    Collections.sort(list);
    System.out.println(list);
    Collections.sort(list);
    System.out.println(list);
    Collections.sort(list, new Dummy());
    System.out.println(list);
  }
}

class Dummy implements Comparator<String>{
  public int compare(String o1, String o2) {
    return o2.compareTo(o1);
  }
}