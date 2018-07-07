import java.nio.file.*;

public class TestClass {
  
  public static void main(String[] args) {
    final Path path = Paths.get(".").normalize();
    int count = 0;
    for(int i=0; i<path.getNameCount(); ++i) {
      count++;
    }
    System.out.println(count);
  }
}