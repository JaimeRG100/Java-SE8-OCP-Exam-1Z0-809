import java.io.*;

public class TestClass {

  public static void main(String[] args) throws FileNotFoundException, IOException {
    String currentPath = System.getProperty("user.dir");
    InputStream is = new FileInputStream(currentPath + "\\stream.txt");
    System.out.print((char)is.read());
    if(is.markSupported()) {  // not supported
      is.mark(100);
      System.out.print((char)is.read());
      System.out.print((char)is.read());
      is.reset();
    }
    System.out.print((char)is.read());
    System.out.print((char)is.read());
    System.out.print((char)is.read());
  }
}