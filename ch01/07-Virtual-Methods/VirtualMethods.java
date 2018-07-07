public class VirtualMethods {
  public static void main(String... args) {
    Animal cow = new Cow();
    Animal bird = new Bird();
    Animal lion = new Lion();
    cow.feed();
    bird.feed();
    lion.feed();
    System.out.println("- - - - - ");
    Cow anotherCow = new Cow();
    Bird anotherBird = new Bird();
    Lion anotherLion = new Lion();
    anotherCow.feed();
    anotherBird.feed();
    anotherLion.feed();
  }
}

abstract class Animal {
  public abstract void feed(); 
}

class Cow extends Animal {
  public void feed() { addHay(); }
  private void addHay() { System.out.println("addHay"); }
}

class Bird extends Animal {
  public void feed() { addSeed(); }
  private void addSeed() { System.out.println("addSeed"); }
}

class Lion extends Animal {
  public void feed() { addMeat();}
  private void addMeat() { System.out.println("addMeat"); }
}