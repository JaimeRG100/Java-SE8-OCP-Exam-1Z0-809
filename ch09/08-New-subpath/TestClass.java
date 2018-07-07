import java.nio.file.*;

public class TestClass {

  public static void main(String[] args) {
    // subpath()
    Path path = Paths.get("/mammal/carnivore/raccon.image");
    System.out.println("Path is: " + path);
    
    System.out.println("Subpath from 0 to 3 is: " + path.subpath(0, 3)); // mammal/carnivore/raccon.image
    System.out.println("Subpath from 1 to 3 is: " + path.subpath(1, 3)); // carnivore/raccon.image
    System.out.println("Subpath from 1 to 2 is: " + path.subpath(1, 2)); // carnivore/
    
    //System.out.println("Subpath from 0 to 4 is: " + path.subpath(0, 4)); // throws Runtime IllegalArgumentException
    //System.out.println("Subpath from 1 to 1 is: " + path.subpath(1, 1)); // throws Runtime IllegalArgumentException
  }
}