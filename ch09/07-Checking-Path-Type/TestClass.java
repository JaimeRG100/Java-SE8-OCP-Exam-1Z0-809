import java.nio.file.*;

public class TestClass {

  public static void main(String[] args) {
    //isAbsolute(), toAbsolutePath()
    Path path1 = Paths.get("c:\\birds\\egret.txt");
    System.out.println("Path1 is Absolute? " + path1.isAbsolute());
    System.out.println("Absolute Path1: " + path1.toAbsolutePath());
    System.out.println("- - - - - - - ");
    
    Path path2 = Paths.get("birds/condor.txt");
    System.out.println("Path2 is Absolute? " + path2.isAbsolute());
    System.out.println("Absolute Path2 " + path2.toAbsolutePath());
  }
}