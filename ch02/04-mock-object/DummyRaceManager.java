import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class DummyRaceManager implements RaceManager {
  public Animal getWinner(List<Animal> animals) {
    return animals == null || animals.size() == 0 ? null : animals.get(0);    
  }
  
  //test code
  public static void main(String... args){
    DummyRaceManager dummyRaceMgr = new DummyRaceManager();
    System.out.println(dummyRaceMgr.getWinner(new ArrayList<Animal>()));  // ArrayList with 0 elements
    ArrayList<Animal> list = new ArrayList<>();
    // list.add(new Tortoise()).add(new Hare());   // chaining methods is not allowed
    dummyRaceMgr.getWinner(Arrays.asList(new Tortoise(), new Hare()));
    
    
  }
  
}

/*public*/ class Animal {}
/*public*/ class Tortoise extends Animal {}
/*public*/ class Hare extends Animal {}
/*public*/ interface RaceManager {
  public Animal getWinner(List<Animal> animals);
  
}