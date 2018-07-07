import java.util.*;

public class SortRabbits {
  static class Rabbit { int id; }
  public static void main(String[] args) {
    List<Rabbit> rabbits = new ArrayList<>();
    rabbits.add(new Rabbit());
    Collections.sort(rabbits);    // Does not compile
                                  // sort() method uses the compareTo() method to sort
                                  // It expects the objects to be sorted to be Comparable
  }
}