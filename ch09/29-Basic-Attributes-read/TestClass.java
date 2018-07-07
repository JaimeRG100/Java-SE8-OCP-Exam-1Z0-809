import java.nio.file.*;
import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributes;

public class TestClass {

  public static void main(String[] args) throws IOException {
    Path path = Paths.get("/turtles/sea.txt");
    BasicFileAttributes data = Files.readAttributes(path, BasicFileAttributes.class);
    System.out.println("Is path directory? " + data.isDirectory());
    System.out.println("Is path regular file? " + data.isRegularFile());
    System.out.println("Is path symbolic link? " + data.isSymbolicLink());
    System.out.println("Path not a file, directory, not symbolic link? " + data.isOther());
    System.out.println("Size (in bytes): " + data.size());
    System.out.println("Creation date/time: " + data.creationTime());
    System.out.println("Last modified date/time: " + data.lastModifiedTime());
    System.out.println("Lass accessed date/time: " + data.lastAccessTime());
    System.out.println("Unique file identifier (if available): " + data.fileKey());
  }
}