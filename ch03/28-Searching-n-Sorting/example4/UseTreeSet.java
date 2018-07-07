import java.util.*;

public class UseTreeSet {
  static class Rabbit { int id; }
  
  public static void main(String[] args) {
    Set<Duck> ducks = new TreeSet<>();
    ducks.add(new Duck("Puddles"));
    Set<Rabbit> rabbits = new TreeSet<>();
    rabbits.add(new Rabbit());               // throws an exception because Rabbit does not implement Comparable
  }
}