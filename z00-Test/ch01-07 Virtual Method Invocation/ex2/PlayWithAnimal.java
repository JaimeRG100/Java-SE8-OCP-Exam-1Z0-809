public class PlayWithAnimal {
  public static void main(String... args) {
    Animal animal = new Lion();
    animal.careFor();
    
    animal.test();
    ((Lion)animal).test();
    System.out.println(animal.age);
    System.out.println(((Lion)animal).age);
  }
}

abstract class Animal {
  public void careFor() {
    play();
  }
  
  public static int age = 0;
  
  public static void test() {
    System.out.println("try Animal");
  }
  
  public void play() {
    System.out.println("pet animal");
  } 
}

class Lion extends Animal {
  public void play() {
    System.out.println("toss in meat");
  } 
  public static int age = 1;
  
  public static void test() {
    System.out.println("try Lion");
  }
}