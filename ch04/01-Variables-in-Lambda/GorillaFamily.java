interface Gorilla {
  String move();
}

public class GorillaFamily {
  String walk = "walk";
  
  void everyonePlay(boolean baby) {
    String approach = "amble";
    // approach = "run";
    play(() -> walk);
    play(() -> baby ? "hitch a ride" : "run");
    play(() -> approach);
  }
  
  void play(Gorilla g) {
    System.out.println(g.move());
  }
  
  // test code
  public static void main(String[] args) {
    GorillaFamily gorillaFam = new GorillaFamily();
    gorillaFam.everyonePlay(true);
    System.out.println("- - - - -");
    gorillaFam.play(() -> new GorillaFamily().toString());
    String test = "ok";
    test += " ready.";
    //gorillaFam.play(() -> test);   // Error: local variables referenced from a lambda expression must be final or effectively final
  }
}