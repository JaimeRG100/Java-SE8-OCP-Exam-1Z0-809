import java.nio.file.*;

public class TestClass {
  
  public static void main(String[] args) {
    // If the current working directory is /user/home, what is the output of .. 
    Path path = Paths.get("/zoo/animals/bear/koala/food.txt");
    System.out.println(path.subpath(1, 3).getName(1).toAbsolutePath());  
    // The output would be:    /user/home/bear
  }
}