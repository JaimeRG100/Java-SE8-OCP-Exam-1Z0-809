import java.io.*;

public class CopyBufferFileSample {
  
  public static boolean copy(File source, File destination) {
    try(
        InputStream in = new BufferedInputStream(new FileInputStream(source));
        OutputStream out = new BufferedOutputStream(new FileOutputStream(destination));
        ) {
          
          byte[] buffer = new byte[1024];
          int lengthRead;
          while((lengthRead = in.read(buffer)) > 0) {
            out.write(buffer, 0, lengthRead);
            out.flush();
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