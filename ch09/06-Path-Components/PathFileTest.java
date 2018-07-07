import java.nio.file.*;

public class PathFileTest {
  
  public static void printPathInformation(Path path) {
    //getFileName(), getRoot(), getParent()
    System.out.println("Filename is: " + path.getFileName());
    System.out.println("Root is: " + path.getRoot());
    Path currentPath = path;
    while((currentPath = currentPath.getParent()) != null) {
      System.out.println("  Current Path: " + currentPath);
    }
  }
  
  public static void main(String[] args) {
    printPathInformation(Paths.get("/zoo/armadillo/shells.txt"));
    System.out.println("- - - - ");
    printPathInformation(Paths.get("armadillo/shells.txt"));
  }
}