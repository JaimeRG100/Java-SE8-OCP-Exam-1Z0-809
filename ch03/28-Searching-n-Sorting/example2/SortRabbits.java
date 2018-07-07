import java.util.*;

public class SortRabbits {
  static class Rabbit { int id; public String toString(){return "" + id;} }
  public static void main(String[] args) {
    List<Rabbit> rabbits = new ArrayList<>();
    rabbits.add(new Rabbit());
    Comparator<Rabbit> c = (r1, r2) -> r1.id - r2.id;
    Collections.sort(rabbits, c);
    
    
    // test code
    rabbits.get(0).id = 1;
    rabbits.add(new Rabbit());
    rabbits.get(1).id = 4;
    rabbits.add(new Rabbit());
    rabbits.get(2).id = 3;
    System.out.println(rabbits);
    Collections.sort(rabbits, c);
    System.out.println(rabbits);
  }
}