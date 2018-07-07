import java.util.*;  // fix # 5

public class Compiles {
  static class RainException extends Exception {}  // fix # 2
  
  public static void main(String[] args) throws RainException { // fix # 3
    try (Scanner s = new Scanner("rain"); /*String line = ""; */) { // fix # 1
      String line; 
      if(s.nextLine().equals("rain"))
        throw new RainException();     
    } finally {
      //s.close();  // fix # 4 
    }
  }
}