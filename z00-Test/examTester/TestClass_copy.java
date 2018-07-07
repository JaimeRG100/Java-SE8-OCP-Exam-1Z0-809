import java.sql.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
import java.time.*;
import java.nio.file.*;
import java.io.*;

public class TestClass {
  public static void main(String[] args)   {  
    
    try(InputStream is = new FileInputStream(new File("TestClass.java"));
        OutputStream out = new FileOutputStream(new File("TestClass_copy.java"))) {
      int data = 0;
      while ((data = is.read())!=-1) {
        System.out.print((char)data);
        out.write(data);
      }
    } catch(IOException e) {
      System.out.println(e);
    }
    
    
   }  
}