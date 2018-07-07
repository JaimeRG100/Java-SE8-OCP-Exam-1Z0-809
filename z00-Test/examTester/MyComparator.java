import java.util.*;
public class MyComparator implements Comparator<String> {
  public int compare(String a, String b) {
    return b.toLowerCase().compareTo(a.toLowerCase());
  }
  public static void main(String[] args) {
    TreeSet<String> tree = new TreeSet<String>();
    tree.add("one");
    tree.add("One");
    tree.add("ONE");
    System.out.println(tree);
    System.out.println(tree.ceiling("On"));
    String[] values = { "123", "Abb", "aab" };
    Arrays.sort(values);
    System.out.println(values[0] + ", " + values[1] + ", " + values[2]);
    Arrays.sort(values, new MyComparator());
    System.out.println(values[0] + ", " + values[1] + ", " + values[2]);
  }
}