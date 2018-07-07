@FunctionalInterface
public interface Run extends Sprint {}              // Valid functional interface (only one abstract method)

@FunctionalInterface
/*public*/ interface SprintFaster extends Sprint {  // Valid functional interface (only one abstract method)
  public void sprint(Animal animal);
}

@FunctionalInterface
/*public*/ interface Skip extends Sprint {          // Valid functional interface (only one abstract method)
  public default int getHopCount(Kangoroo kangoroo) { return 10; }
  public static void skip(int speed) {}
}


// previous code: 

@FunctionalInterface
/*public*/ interface Sprint {
  public void sprint(Animal animal);            // valid functional interface
}

/*public*/ class Animal {} 
/*public*/ class Kangoroo extends Animal {} 