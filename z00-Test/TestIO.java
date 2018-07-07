import java.util.*;
import java.util.stream.*;
import java.io.*;

class TestIO {
  public static void main(String[] args) {
    
    // InputStream
    try (InputStream in = new FileInputStream("zoo.txt")) {
      int data;
      while((data = in.read())>0){
        System.out.print((char)data);
      }
    } catch(IOException e) {
      System.out.print(e);
    }
    
    System.out.println("\n-------------------");
    
    // FileReader
    try (FileReader in = new FileReader("zoo.txt")) {
      int c;
      while ((c=in.read())>0)
        System.out.print((char)c);
        
    } catch(IOException e) {
      System.out.println(e);
    }
    
    System.out.println("\n-------------------");
    
    // BufferedFileReader
    
    try(BufferedReader in = new BufferedReader(new FileReader("zoo.txt"))) {
      String data; 
      while((data = in.readLine())!= null) {
        System.out.println(data);
      }
    } catch(IOException e) {
      System.out.print(e);
    }
    
  }
}