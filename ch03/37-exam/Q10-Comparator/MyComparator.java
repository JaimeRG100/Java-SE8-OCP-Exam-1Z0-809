import java.util.*;

public class MyComparator implements Comparator<String> {
  
  public int compare(String a, String b) {
    return b.toLowerCase().compareTo(a.toLowerCase());
  }
  
  public static void main(String[] args) {
    String[] values = { "123", "Abb", "aab" };
    Arrays.sort(values, new MyComparator());
    for(String s: values) {
      System.out.print(s + " ");
    }
    
  }
}