import java.io.*;

public class TestClass {

  public static void main(String[] args) {
    
    // Example of FileReader and BufferedReader
    try (BufferedReader bufferedReader = new BufferedReader(new FileReader("c:\\test\\zoo.txt"))) {
      System.out.println(bufferedReader.readLine());
    } catch (IOException e) {
      System.out.println(e);
    }
    
    // Example of ObjectInputStream
    try (ObjectInputStream objectStream = new ObjectInputStream(
                                              new BufferedInputStream(
                                                  new FileInputStream("c:\\test\\zoo.txt")))) {
      System.out.println(objectStream.readObject());
    } catch (IOException | ClassNotFoundException e) {
      System.out.println(e);
    }
    
    // Example of wrapping incompatible classes 
    // new BufferedInputStream(new FileReader("zoo.txt"));
    // new BufferedWriter(new FileReader("zoo.txt"));
    // new ObjectInputStream(new FileOutputStream("zoo"));
    // new BufferedInputStream(new BufferedOutputStream());
    
  }
}