public class FindMatchingAnimals {
  
  private static void print(Animal animal, CheckTrait trait) {
    if(trait.test(animal))
      System.out.println(animal);
  }
  
  public static void main(String[] args) {
    print(new Animal("fish", false, true), (a) -> a.canHop());
    print(new Animal("kangaroo", true, false), (a) -> a.canHop());
    System.out.println("- - - - - - -");
    
    print(new Animal("fish", false, true), (a) -> a.canSwim());
    print(new Animal("kangaroo", true, false), (a) -> a.canSwim());
    System.out.println("- - - - - - -");
    
    CheckTrait ct = (a) -> a.canHop();
    System.out.println(ct.test(new Animal("fish", false, true)));
    System.out.println(ct.test(new Animal("kangaroo", true, false)));
    System.out.println("- - - - - - -");
    
    CheckName cn = (a) -> a.toString().length() > 4;
    ct = (a) -> cn.check(a);
    System.out.println(ct.test(new Animal("fish", false, true)));
    System.out.println(ct.test(new Animal("shark", false, true)));
    System.out.println(ct.test(new Animal("kangaroo", true, false)));
  }
}


class Animal {
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

@FunctionalInterface
interface CheckTrait {
  public boolean test(Animal a);
}

@FunctionalInterface
interface CheckName {
  public boolean check(Animal a);
}