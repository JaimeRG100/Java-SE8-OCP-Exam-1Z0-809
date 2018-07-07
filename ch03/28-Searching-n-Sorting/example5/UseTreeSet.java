import java.util.*;

public class UseTreeSet {
  static class Rabbit { int id; public String toString() {return "" + id; }}
  
  public static void main(String[] args) {
    Set<Rabbit> rabbits = new TreeSet<>(new Comparator<Rabbit>() {
      public int compare(Rabbit r1, Rabbit r2) {
        return r1.id - r2.id;
      }
    });
    rabbits.add(new Rabbit());               // now Rabbit implements Comparable
    
    //test code
    rabbits.clear();
    Rabbit r = new Rabbit();
    r.id = 3;
    rabbits.add(r);
    r = new Rabbit();
    r.id = 2;
    rabbits.add(r);
    r = new Rabbit();
    r.id = 1;
    rabbits.add(r);
    System.out.println(rabbits);
  }
}