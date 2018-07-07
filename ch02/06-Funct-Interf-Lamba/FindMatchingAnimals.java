public class FindMatchingAnimals {
  private static void print(Animal animal, CheckTrait trait) {
    if(trait.test(animal))
      System.out.println(animal);
  }
  
  public static void main(String[] args) {
    print(new Animal("fish", false, true), a -> a.canHop());
    print(new Animal("kangoroo", true, false), a -> a.canHop());
    
    // test code
    print(new Animal("kangoroo 2", true, false), (a) -> { return a.canHop(); } );
    print(new Animal("kangoroo 3", true, false), (Animal a) -> { return a.canHop(); } );
    CheckTrait_2 functionalInterface1 = () -> new Animal("Gorilla", true, false);
    Animal animal1 = functionalInterface1.test();
    CheckTrait functionalInterface2 = a -> { return a.canHop(); };
    System.out.println("Horse ~ " + functionalInterface2.test(new Animal("Horse", true, false)));
    CheckTrait_3 functionalInterface3 = (String s) -> {};
    functionalInterface3 = (String s) -> { return; };
    functionalInterface3.test("fish");
    functionalInterface3 = (String s) -> { try {
                                                 throw new Exception();
                                               } catch (Exception e) {
                                                 System.out.println(e);}};
    functionalInterface3.test("fish");    
    CheckTrait_4 functionalInterface4 = (x) -> { int sum = 0; for(int i = 1; i <= x; i++) {
                                System.out.println(x + " x " + i + " = " + (x*i));
                                sum += (x*i);
                               }
                               return "Sum: " + sum; };
    System.out.println(functionalInterface4.multiplyTable(3));
    Animal animal2 = new Animal("kangoroo", true, false);
    CheckTrait functionalInterface5 = a -> { return "testing".startsWith("test");};
    System.out.println(functionalInterface5.test(animal2));
    functionalInterface5 = (Animal a) -> "testing".startsWith("test");
    System.out.println(functionalInterface5.test(animal2));
    functionalInterface5 = a -> true;
    System.out.println(functionalInterface5.test(animal2));
    
  }
}

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

/*public*/ interface CheckTrait {
  public boolean test(Animal a);
}

// test code
/*public*/ interface CheckTrait_2 {
  public Animal test();
}

/*public*/ interface CheckTrait_3 {
  void test(String species);
}

/*public*/ interface CheckTrait_4 {
  public String multiplyTable(int x);
}