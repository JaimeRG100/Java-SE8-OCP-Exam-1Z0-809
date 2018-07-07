import java.nio.file.Path;
import java.nio.file.Paths;
import java.net.URI;
import java.net.URISyntaxException;

public class TestClass {
  
  public static void main(String[] args) {
    { // Paths.getPath(String)
      Path path1 = Paths.get("pandas/cuddly.png");                     // relative file
      Path path2 = Paths.get("c:\\zooinfo\\November\\employees.txt");  // absolute file
      Path path3 = Paths.get("/home/zoodirector");                     // absolute directory
      System.out.println(path1 + "\n" + path2 + "\n" + path3);
      System.out.println("- - - - - - - - - - ");
    }
    
    { // Paths.get(String, String...).
      Path path1 = Paths.get("pandas", "cuddly.png");
      Path path2 = Paths.get("c:","zooinfo","November","employees.txt");
      Path path3 = Paths.get("/","home","zoodirector");
      System.out.println(path1 + "\n" + path2 + "\n" + path3);
      System.out.println("- - - - - - - - - - ");
    }
    
    { // Path vs. Paths 
      //Paths path1 = Paths.get("/alligator/swim.txt"); // DOES NOT COMPILE
      //Path path2 = Path.get("/crocodile/food.csv"); // DOES NOT COMPILE
      //Paths path2 = Path.get("/crocodile/swim.csv"); // DOES NOT COMPILE
    }
    
    { // Paths.getPath(URI)
      try {
        Path path1 = Paths.get(new URI("file://pandas/cuddly.png"));  // might throw an exception depending on the OS
        Path path2 = Paths.get(new URI("file:///c:/zoo-info/November/employees.txt"));
        Path path3 = Paths.get(new URI("file:///home/zoodirectory"));
        System.out.println(path1 + "\n" + path2 + "\n" + path3);
        System.out.println("- - - - - - - - - - ");
      }
      catch (URISyntaxException e) {
        System.out.println(e);
      }
    } 
    
    { // example of non-local file system schemas using URI
      try {
        Path path4 = Paths.get(new URI("http://www.wiley.com"));
        Path path5 = Paths.get(new URI("ftp://username:password@ftp.the-ftp-server.com"));
        URI uri4 = path4.toUri();
      } catch (Exception e) {
        System.out.println(e);
      } 
    }
  }
}