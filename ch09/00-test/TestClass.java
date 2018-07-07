import java.nio.file.FileSystems;
import java.nio.file.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.net.URI;
import java.net.URISyntaxException;
import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributeView;

public class TestClass {
  
  public static void main(String[] args) throws URISyntaxException, IOException {
    System.out.println(Files.isSameFile(Paths.get("C:/test2"),Paths.get("C:/test/ok/..")));
  }
}