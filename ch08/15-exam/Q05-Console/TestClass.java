import java.io.*; 

public class TestClass {
  
  public static void main(String[] args) throws IOException {
    String line;
    Console c = System.console();
    Writer w = c.writer();
    if((line = c.readLine()) != null)
      w.append(line);
    w.flush();
  }
}
