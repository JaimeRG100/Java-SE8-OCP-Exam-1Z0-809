import java.nio.file.*;
import java.io.IOException;
import java.nio.file.attribute.UserPrincipal;

public class TestClass {

  public static void main(String[] args) {
    // examples of getOwner() and setOwner(), including UserPrincipalLookupService
    try {
      // Read owner of file
      Path path = Paths.get("/chicken/feathers.txt");
      System.out.println(Files.getOwner(path).getName());
      // Change owner of file
      UserPrincipal owner = path.getFileSystem()
        .getUserPrincipalLookupService().lookupPrincipalByName("Alexander");
      Files.setOwner(path, owner);
      // Output the updated owner information
      System.out.println(Files.getOwner(path).getName());
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}