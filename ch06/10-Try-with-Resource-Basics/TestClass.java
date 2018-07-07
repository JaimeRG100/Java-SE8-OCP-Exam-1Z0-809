import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class TestClass {
  
  public void newApproach(Path path1, Path path2) throws IOException {
    // The syntax of a basic try-with-resources
    // ----------------------------------------
    try (BufferedReader r = Files.newBufferedReader(path1); BufferedWriter w = Files.newBufferedWriter(path2)){
      // protected code
    }
    
    // The syntax of try-with-resources including catch / finally
    // ----------------------------------------------------------
    try (BufferedReader r = Files.newBufferedReader(path1); BufferedWriter w = Files.newBufferedWriter(path2)) {
      // protected code
    } catch (IOException e) {
      // exception handler
    } finally {
      // finally block
    }
  }
  
  public static void main(String[] args) {
    
    // The resource is no longer available before the implicit finally runs
    // --------------------------------------------------------------------
    try (Scanner s = new Scanner(System.in)) {
      s.nextLine();
    } catch(Exception e) {
      //s.nextInt();    // Does not compile (cannot find symbol)
    } finally {
      //s.nextInt();    // Does not compile (cannot find symbol)
    }
    
  }
}