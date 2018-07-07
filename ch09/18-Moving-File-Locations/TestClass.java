import java.nio.file.*;
import java.io.*;

public class TestClass {
  
  public static void main(String[] args) {
    // Files.copy(InputStream, Path)   Files.copy(Path, OutputStream)
    try {
      System.out.println(Files.move(Paths.get("c:\\zoo"), Paths.get("c:\\zoo-new")));  // Prints the resulting Path if moved successfully, else throws NoSuchFileException or FileAlreadyExistsException
      System.out.println(Files.move(Paths.get("c:\\user\\addresses.txt"), Paths.get("c:\\zoo-new\\addresses.txt"))); // Prints the resulting Path if moved successfully, else throws NoSuchFileException or FileAlreadyExistsException
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}