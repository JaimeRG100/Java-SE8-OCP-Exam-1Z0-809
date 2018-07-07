import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Duck implements Comparable<Duck> {
  private String name;
  
  public Duck(String name) {
    this.name = name;
  }
  
  public String getName() { return name; }
  
  public String toString() { return name; }
  
  public int compareTo(Duck d) {
    return name.compareTo(d.name);
  }
}