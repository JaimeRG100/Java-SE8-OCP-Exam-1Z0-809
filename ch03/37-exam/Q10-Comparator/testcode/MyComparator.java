import java.util.*;

public class MyComparator implements Comparator<String> {
  
  public int compare(String a, String b) {
    return b.toLowerCase().compareTo(a.toLowerCase());
  }
  
  public static void main(String[] args) {
    String[] values = { "123", "Abb", "aab" };
    
    // option 1 - implements 
    Arrays.sort(values, new MyComparator());
    for(String s: values)
      System.out.print(s + " ");
    System.out.println();
    
    // option 2 - inner class
    Comparator<String> myComp = new Comparator<String>() {
      public int compare(String a, String b) {
        return b.toLowerCase().compareTo(a.toLowerCase());
      }
    };
    Arrays.sort(values, myComp);
    for(String s: values)
      System.out.print(s + " ");
    System.out.println();
    
    // option 3 - lambda
    Comparator<String> lambda = (a, b) -> b.toLowerCase().compareTo(a.toLowerCase());
    Arrays.sort(values, lambda);
    for(String s: values)
      System.out.print(s + " ");
    System.out.println();
    
    // option 4 - lambda 2
    Arrays.sort(values, (a, b) -> b.toLowerCase().compareTo(a.toLowerCase()));
    for(String s: values)
      System.out.print(s + " ");
    System.out.println();
    
  }
}