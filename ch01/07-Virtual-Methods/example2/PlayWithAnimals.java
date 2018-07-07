public class PlayWithAnimals {
  public static void main(String... args) {
    Animal animal = new Lion();
    animal.printName();
  }
}

abstract class Animal {
  String name = "???";
  public void printName() {
    System.out.println(name);
  }
}

class Lion extends Animal {
  String name = "Leo";
  public void printName() {
    System.out.println(name);
  }
}

