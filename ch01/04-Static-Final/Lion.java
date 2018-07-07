abstract class Cat {
  String name = "The Cat";
  //static final String name = "The Cat";  // option 1
  void clean() { }
  //static void clean() { }                // option 2
  //void clean() { }                         // option 3 
}


public class Lion extends Cat {
  void clean() { }
  //static void clean() { }                 // option 2
  //final void clean() { }                    // option 3 
}

