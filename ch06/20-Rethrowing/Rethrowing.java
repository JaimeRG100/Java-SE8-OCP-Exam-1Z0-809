import java.sql.SQLException;
import java.time.format.DateTimeParseException;

public class Rethrowing {
  
  // It is a common pattern to log and then throw the same exception. 
  // Suppose that we have a method that declares two checked exceptions:
  
  public void parseData() throws SQLException, DateTimeParseException { }
  
  public void multiCatch() throws SQLException, DateTimeParseException { 
    try {
     parseData(); 
    } catch (SQLException | DateTimeParseException e) {   // the list of Exceptions are duplicated
      System.err.println(e);
      throw e;
    }
  }
  
  // Java 7 designers decided to solve this problem at the same time.
  // They made it legal to write Exception in the catch block. 
  
  public void rethrowing() throws SQLException, DateTimeParseException {
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