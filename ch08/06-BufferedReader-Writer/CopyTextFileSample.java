import java.util.*;
import java.io.*;

public class CopyTextFileSample {
  
  public static List<String> readFile(File source) {
    List<String> data = new ArrayList<>();
    try (BufferedReader reader = new BufferedReader(new FileReader(source))) {
      String s;
      while((s = reader.readLine()) != null) {
        data.add(s);
      }
    } catch(IOException e) {
    }
    return data;
  }
  
  public static void writeFile(List<String> data, File destination) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(destination))) {
      for(String s: data) {
        writer.write(s);
        writer.newLine();
      }
    } catch(IOException e) {
    }
  }

  public static void main(String[] args) {
    String currentPath = System.getProperty("user.dir");
    File source = new File(currentPath + "\\zoo.txt");
    File destination = new File(currentPath + "\\zoo-copy.txt");
    List<String> data = readFile(source);
    System.out.println(data);
    writeFile(data, destination);
  }
}