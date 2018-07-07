public class Swimmer {
  enum AnimalClasses {
    MAMMAL, FISH {      //abstract enum methods require each enum type to implement the method.
      public boolean hasFins() { return true; } },
    BIRD, REPTILE, AMPHIBIAN, INVETEBRATE;
    public abstract boolean hasFins();
  }
}