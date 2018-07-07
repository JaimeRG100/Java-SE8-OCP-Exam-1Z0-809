// which implementation is best?:

public class ExampleOne implements AutoCloseable {                  //ExampleOne is the best implementation. 
  public void close() throws IllegalStateException {
    throw new IllegalStateException("Cage door does not close");
  }
}

/*public*/ class ExampleTwo implements AutoCloseable {             // ExampleTwo throws Exception rather than a more specific subclass
  public void close() throws Exception {
    throw new Exception("Cage door does not close");
  }  
}

/*public*/ class ExampleThree implements AutoCloseable {          // ExampleThree has a side effect. It changes the state of a variable
  static int COUNT = 0;
  public void close() {
    COUNT ++;
  }
}