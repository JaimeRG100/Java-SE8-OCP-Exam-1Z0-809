import java.util.*;
import java.io.*;

public class TestClass {
  public static void main(String[] args) {
    List<? super IOException> exceptions = new ArrayList<Exception>();
    // exceptions.add(new Exception());         // Error: no suitable method found for add(java.lang.Exception)
    exceptions.add(new IOException());
    exceptions.add(new FileNotFoundException());
  }  
}