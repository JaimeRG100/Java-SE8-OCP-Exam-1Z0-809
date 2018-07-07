import java.util.*;

public class TestRaceManager implements RaceManager {
  public Animal getWinner(List<Animal> animals) {
    for(Animal animal: animals) 
      System.out.println(animal.getName() + " , " + animal.getType());
    System.out.println("- - - - -");
    return animals == null ? null : animals.get(0);
  }
  
  public static void main(String[] args) {
    List<Animal> list = new ArrayList<>();
    list.add(new Tortoise("tortoise", "ttt"));
    list.add(new Hare("hare", "hhh"));
    TestRaceManager trm = new TestRaceManager();
    System.out.println(trm.getWinner(list));
  }
}

class Animal {
  public String getName() { return ""; }
  public String getType() { return ""; }
}
class Tortoise extends Animal {
  String name, type;
  public Tortoise(String n, String t) {
    name = n;
    type = t;
  }
  public String getName() { return name; }
  public String getType() { return type; }
}
class Hare extends Animal {
  String name, type;
  public Hare(String n, String t) {
    name = n;
    type = t;
  }
  public String getName() { return name; }
  public String getType() { return type; }
}
interface RaceManager {
  public Animal getWinner(List<Animal> animals);
}