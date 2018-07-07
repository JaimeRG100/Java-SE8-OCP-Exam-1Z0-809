import java.io.*; 

public class TestClass {
  
  public static void main(String[] args){
    // Suppose that the file c:\book\java exists. Which of the following 
    // lines of code creates an object that represents the file?
    new File("c:\\book\\java");
    new File("c:/book/java");
    new File("c:/book\\java");
  }
}