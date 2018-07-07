import java.io.IOException;
import java.io.FileNotFoundException;

public class TestClass {

  public static void main(String[] args) {
    
    // example 1 --------------------------------------
    
    try {  }
    //catch (Exception1 e | Exception2 e | Exception3 e) { }      // Does not compile
    //catch (Exception1 e1 | Exception2 e2 | Exception3 e3) { }   // Does not compile
    catch (Exception1 | Exception2 | Exception3 e) { }
    finally {  }
    
    
    // example 2 --------------------------------------
    
    try {
      throw new IOException();
    } 
    // catch(FileNotFoundException | IOException e) {}   // Does not compile (now allowed related Exceptions Classes)
    catch(IOException e) { }
    
    
    // example 3 --------------------------------------
    //Correct declaration
    try {
      throw new IOException();
    } catch(IOException e) { }
  }
}

class Exception1 extends RuntimeException { }
class Exception2 extends RuntimeException { }
class Exception3 extends RuntimeException { }