/*
 *  Functional interface provided by Java in:
 *  package java.util.funtion.Predicate;
 *  -----------------------------------------
 *  public interface Predicate<T> {
 *    public boolean test(T t); 
 *  }
 */

import java.util.function.Predicate;

public class FindMatchingAnimals {
  private static void print(Animal animal, Predicate<Animal> trait) {
    if(trait.test(animal)) 
      System.out.println(animal);
  }
  
  public static void main(String[] args) {
    print(new Animal("fish", false, true), a -> a.canHop());
    print(new Animal("kangoroo", true, false), a -> a.canHop());
  }
}

// previous code: 

/*public*/ class Animal {
  private String species;
  private boolean canHop;
  private boolean canSwim;
  public Animal(String speciesName, boolean hopper, boolean swimmer) {
    species = speciesName;
    canHop = hopper;
    canSwim = swimmer;
  }
  public boolean canHop() { return canHop; }
  public boolean canSwim() { return canSwim; }
  public String toString() { return species; }
}
