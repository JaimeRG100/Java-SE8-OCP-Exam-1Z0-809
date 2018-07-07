import java.io.*;

public class MyCopyTextFileSample {
  
  public static boolean copy(File source, File destination) {
    try (BufferedReader reader = new BufferedReader(new FileReader(source));
         BufferedWriter writer = new BufferedWriter(new FileWriter(destination))) {
      String s;
      while((s = reader.readLine()) != null) {
        writer.write(s);
        writer.newLine();
      }
      return true;
    } catch(IOException e) {
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