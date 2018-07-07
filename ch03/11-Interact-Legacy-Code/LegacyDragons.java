import java.util.*;
class Dragon {}
class Unicorn {}

public class LegacyDragons {  
  
  public static void main(String[] args) {
    List unicorns = new ArrayList();
    unicorns.add(new Unicorn());
    printDragons(unicorns);
  }
  
  private static void printDragons(List<Dragon> dragons) {
    for(Dragon dragon: dragons) {
      System.out.println(dragon);
    }
  }
}