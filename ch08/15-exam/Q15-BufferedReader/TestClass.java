import java.io.*; 

public class TestClass {
  
  private void echo() throws IOException {
    try(FileReader fileReader = new FileReader("zoo-data.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader)) {
          //System.out.println((char) fileReader.read());   // test code
          System.out.println(bufferedReader.readLine());
        }
  }
  
  public static void main(String[] args) throws IOException {
     new TestClass().echo();
  }
}