abstract class Animal {
  public abstract void feed();
  
  public void feedAnimal(Animal animal) {
   animal.feed();
  }
  
  public static void main(String[] args) {
    Animal bird = new Bird();    
    Animal lion = new Lion();
    
    bird.feedAnimal(bird);
    bird.feedAnimal(lion);
  }
}

class Bird extends Animal {
  public void feed() { addSeed(); }
  private void addSeed() { System.out.println("Bird");}
}
class Lion extends Animal {
  public void feed() { addMeat(); }
  private void addMeat() { System.out.println("Lion"); }
}