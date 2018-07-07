class Animal {
}
class Cow extends Animal {
  void addHay() { System.out.println("Cow > addHay()"); }
}
class Bird extends Animal {
  void addSeed() { System.out.println("Bird > addSeed()"); }
}
class Lion extends Animal {
  void addMeat() { System.out.println("Lion > addMeat()"); }
}

public class TestAnimals {
  public static void feedAnimal(Animal animal) {
    if (animal instanceof Cow)
      ((Cow)animal).addHay();
    else if (animal instanceof Bird)
      ((Bird)animal).addSeed();
    else if (animal instanceof Lion)
      ((Lion)animal).addMeat();
  }
  
  public static void main(String[] args) {
    Animal cow = new Cow();
    Animal bird = new Bird();
    Animal lion = new Lion();
    
    feedAnimal(cow);
    feedAnimal(bird);
    feedAnimal(lion);
    
    System.out.println("- - - - - -");
    
    Cow anotherCow = new Cow();
    Bird anotherBird = new Bird();
    Lion anotherLion = new Lion();
    
    feedAnimal(anotherCow);
    feedAnimal(anotherBird);
    feedAnimal(anotherLion);
    
  }
}