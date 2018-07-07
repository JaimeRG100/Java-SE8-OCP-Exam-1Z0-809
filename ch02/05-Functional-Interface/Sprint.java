@FunctionalInterface
public interface Sprint {
  public void sprint(Animal animal);            // valid functional interface
}

/*public*/ class Tiger implements Sprint {      // valid class that implemtnes the (functional) interface
  public void sprint(Animal animal) {
    System.out.println("Animal is sprinting fast! " + animal.toString());
  }
}

/*public*/ class Animal {} 