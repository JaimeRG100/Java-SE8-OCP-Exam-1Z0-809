import java.io.IOException;
import java.io.FileNotFoundException;
import java.sql.SQLException;

public class TestClass {

  public static void main(String[] args) {
    // To review multi-catch, see how many errors you can find in this try statement
    /* 12: */    try {
    /* 13: */      mightThrow();
    /* 14: */    } catch (FileNotFoundException | IllegalStateException e) {
    /* 15: */    } catch (InputMismatchException e | MissingResourceException e) {
    /* 16: */    } catch (SQLException | ArrayIndexOutOfBoundsException e) {
    /* 17: */    } catch (FileNotFoundException | IllegalArgumentException e) {
    /* 18: */    } catch (Exception e) {
    /* 19: */    } catch (IOException e) {
    }
    
    
    // Line 15 has an extra variable name
    // Line 18 and 19 are reversed
    // Line 17 cannot catch FileNotFoundException because that exception was already caught on line 14.
    // Line 16 cannot catch SQLException because nothing in the try statement can potentially throw one.
    //      14    ||    ||  FileNotFoundException  ||    ||  . . .
  }
  
  public static void mightThrow()  {}
}