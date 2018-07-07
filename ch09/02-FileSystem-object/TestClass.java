import java.nio.file.*; 
import java.net.URI; 
import java.net.URISyntaxException;

public class TestClass {
  
  public static void main(String[] args) {
    { // The Path.get() is a shorthand FileSystems.getPath()
      Path path1 = FileSystems.getDefault().getPath("pandas/cuddly.png");
      Path path2 = FileSystems.getDefault().getPath("c:","zooinfo","November","employees.txt");
      Path path3 = FileSystems.getDefault().getPath("/home/zoodirector");
      System.out.println(path1 + "\n" + path2 + "\n" + path3);
      System.out.println("- - - - - - - - - - ");
    }
    
    { // the FileSystems factory class does give us the ability to connect to a remote file system
      try {
        FileSystem fileSystem = FileSystems.getFileSystem(new URI("http://selikoff.net"));
        Path path1 = fileSystem.getPath("duck.txt");
      }
      catch (Exception e) {
        System.out.println(e);
      }
    }
  }
}