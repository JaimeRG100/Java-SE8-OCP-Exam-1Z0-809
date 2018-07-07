public interface Hervibore {
  int amount = 10;
  
  public static void eatGrass(); // Error: missing method body, or declare abs
  
  public int chew() {    // Error: interface abstract methods cannot have body
    return 13;
  }
}