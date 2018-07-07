import java.util.*;
class Dragon {}
class Unicorn {}

public class LegacyDragons {  
  
  public static void main(String[] args) {
    List<Dragon> dragons = new ArrayList<>();
    dragons.<Dragon>add(new Dragon());
    printDragons(dragons);
  }
  
  private static void printDragons(List<Dragon> dragons) {
    for(Dragon dragon: dragons) {
      System.out.println(dragon);
    }
  }
}