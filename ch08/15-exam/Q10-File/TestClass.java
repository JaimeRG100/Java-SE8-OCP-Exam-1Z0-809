import java.io.*; 

public class TestClass {
  
  public static void deleteTree(File file) {
    if(!file.isFile())
      for(File entry: file.listFiles())
        deleteTree(entry);
    else
      file.delete();
  }
  
  public static void main(String[] args){
    deleteTree(new File("/turtles"));    
  }
}