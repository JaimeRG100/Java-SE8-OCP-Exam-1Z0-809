import java.io.*;

public class CopyFileSample {
  
  public static boolean copy(File source, File destination) {
    try(
        InputStream in = new FileInputStream(source);
        OutputStream out = new FileOutputStream(destination);
        ) {
          int b;
          while((b = in.read()) != -1) {
            out.write(b);
          }
          return true;
        } catch (IOException e) {
          return false;
        }
  }

  public static void main(String[] args) {
    String currentPath = System.getProperty("user.dir");
    File source = new File(currentPath + "\\zoo.txt");
    File destination = new File(currentPath + "\\zoo-copy.txt");
    System.out.println(copy(source, destination));
  }
}