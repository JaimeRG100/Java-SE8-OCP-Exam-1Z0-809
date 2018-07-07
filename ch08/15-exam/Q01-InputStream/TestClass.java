import java.io.*; 

public class TestClass {
  
  public static void main(String[] args) {
    try {
      InputStream is = new BufferedInputStream(new FileInputStream("zoo.txt"));
      InputStream wrapper1 = new BufferedInputStream(is);
      InputStream wrapper2 = new ObjectInputStream(is);
      //InputStream wrapper3 = new FileInputStream(is);   // no suitable constructor found
    } catch(IOException e) {
      System.out.println(e);
    }
  }
}