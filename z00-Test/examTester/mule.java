import java.util.*;
import java.io.*;
import java.util.stream.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;

class TestClass {
  
  public static void main(String[] args) {
    
    
    try {
      Path path1 = Paths.get("./TestClass.java").normalize(); // k1
      Path path2 = Paths.get("mule.png");
      Files.copy(path1,path2,StandardCopyOption.COPY_ATTRIBUTES); //k2
      System.out.println(Files.isSameFile(path1, path2)); //k3
    }catch(IOException e) { System.out.println(e); }
    
    
    
  }
}