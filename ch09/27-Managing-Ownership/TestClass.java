import java.nio.file.*;
import java.io.IOException;
import java.nio.file.attribute.UserPrincipal;

public class TestClass {
  //FileSystems.getDefault()
  public static UserPrincipal getOwner_FileSystems(String user) throws IOException {
      return FileSystems.getDefault().getUserPrincipalLookupService().lookupPrincipalByName(user);
  }

  //path.getFileSystem()
  public static UserPrincipal getOwner_Path(String user) throws IOException {
    Path path = Paths.get("/");
    return path.getFileSystem().getUserPrincipalLookupService().lookupPrincipalByName(user);
  }
  
  public static void main(String[] args) {
    try {
      System.out.println(getOwner_FileSystems("Alexander"));
      System.out.println(getOwner_Path("Alexander"));
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}