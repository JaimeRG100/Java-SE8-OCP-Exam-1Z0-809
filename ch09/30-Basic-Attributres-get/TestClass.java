import java.nio.file.*;
import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class TestClass {

  public static void main(String[] args) throws IOException {
    // Files.getFileAttributeView(path, BasicFileAttributeView.class);
    Path path = Paths.get("/turtles/sea.txt");
    BasicFileAttributeView view = Files.getFileAttributeView(path, BasicFileAttributeView.class);
    BasicFileAttributes data = view.readAttributes();
    System.out.println("Before: " + data.lastModifiedTime());
    FileTime lastModifiedTime = FileTime.fromMillis(
      data.lastModifiedTime().toMillis() + 10_000);
    view.setTimes(lastModifiedTime, null, null);
    data = view.readAttributes();
    System.out.println("After:  " + data.lastModifiedTime());
  }
}