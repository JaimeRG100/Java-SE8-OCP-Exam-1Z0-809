import java.io.*;
import java.util.*;
import java.util.function.Supplier;

public class ExceptionCaseStudy {
  
  private static List<String> create() throws IOException {
    throw new IOException();
  }
  
  private static void callerMethod() throws IOException {
    // case 1 - ok  -------------------------------------------
    ExceptionCaseStudy.create().stream().count();   // caller method re declare it
    
    // case 2 - bad ------------------------------------------
    //Supplier<List<String>> s = ExceptionCaseStudy::create;   // Does not compile
                                                               // Error: incompatible thrown types IOException in method reference
    
    // case 3 - ok : but ugly --------------------------------
    Supplier<List<String>> s = () -> {
      try{ 
        return ExceptionCaseStudy.create();
      }
      catch (IOException e) {
        throw new RuntimeException(e);   // catch the exception and turn it into an unchecked exception
      }
    };
    
    // case 4 - best: call a wrapped safe method --------------
    Supplier<List<String>> sup = ExceptionCaseStudy::createSafe;
  }
  
  
  // case 4 - best : Create a wrapper method ------------------
  private static List<String> createSafe() {
    try {
      return ExceptionCaseStudy.create();
    }
    catch (IOException e){
      throw new RuntimeException(e);
    }
  }
  

}
