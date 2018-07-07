import java.sql.SQLException;
import java.time.format.DateTimeParseException;
import java.io.IOException;

public class Rethrowing {
  
  // The developers finally finished and decided to remove SQLException from the method
  
  public void parseData() throws IOException, DateTimeParseException { }
  
  // This is the multiCatch version
  
  public void multiCatch() throws IOException, DateTimeParseException {   // We need to make changes here
    try {
     parseData(); 
    } catch (IOException | DateTimeParseException e) {                   // and we also need to make changes here
      System.err.println(e);
      throw e;
    }
  }
  
  // This is the rethrowing version
  
  public void rethrowing() throws IOException, SQLException, DateTimeParseException {   // No code changes are required. 
    try {
    } catch (Exception e) {
      System.err.println(e);
      throw e;
    }
  }
  
  public static void main(String[] args) {
    // test code 1
    try {
      new Rethrowing().multiCatch(); // doesn't throw error
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    
    // test code 2
    try {
      new Rethrowing().rethrowing();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}