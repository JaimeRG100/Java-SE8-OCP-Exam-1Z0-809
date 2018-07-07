public class PlayWithAnimal {
  public static void main(String... args) {
    Animal animal = new Lion();
    animal.careFor();
  }  
}

abstract class Animal {
  public void careFor() {
    play();
  }
  public void play() {
    System.out.println("pet animal");
  }
}

class Lion extends Animal {
  public void play() {
    System.out.println("toss in meat");
  }
}