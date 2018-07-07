abstract class Cat {
  /* Thre ways that make the Lion class compile (extending Cat class) */
  
  // abstract void clean();   // ok  // abstract method
  // void clean() {}          // ok  // default implementation
  // leave code blank         // ok  // nothing to override
}

public class Lion extends Cat {
  void clean() {}
}