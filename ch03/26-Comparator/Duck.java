import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Duck implements Comparable<Duck> {
  private String name;
  private int weight;
  
  public Duck(String name, int weight) {
    this.name = name;
    this.weight = weight;
  }
  
  public String getName() { return name; }
  
  public int getWeight() { return weight; }
  
  public String toString() { return name; }
  
  public int compareTo(Duck d) {
    return name.compareTo(d.name);
  }
  
  public static void main(String[] args) {
    // If we want to sort by something else (than the name),
    // we have to define that sort outside the compareTo() method
    Comparator<Duck> byWeight = new Comparator<Duck>() {
      public int compare(Duck d1, Duck d2) {
        return d1.getWeight() - d2.getWeight();
      }
    };
    List<Duck> ducks = new ArrayList<>();
    ducks.add(new Duck("Quack", 7));
    ducks.add(new Duck("Puddles", 10));
    Collections.sort(ducks);
    System.out.println(ducks);            // [Puddles, Quack] 
    Collections.sort(ducks, byWeight);
    System.out.println(ducks);            // [Quack, Puddles] 
  }
}