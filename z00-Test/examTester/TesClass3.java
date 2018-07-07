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
    
    /*
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
    */
    
    /*
    try (InputStream in = new BufferedInputStream(new FileInputStream(new File("TestClass.java")));
         OutputStream out = new BufferedOutputStream(new FileOutputStream(new File("TestClass_copy2.java")))) {
           byte[] buf = new byte[1024];
           int numRead = 0;
           while((numRead = in.read(buf))>0) {
             for(int i=0; i< numRead; i++) 
               System.out.print((char)buf[i]);
             System.out.println();
             out.write(buf);
             //out.newLine();
           }
    } catch(IOException e) {
      System.out.println(e);
    }
    */
    
    try(BufferedReader in = new BufferedReader(new FileReader("TestClass.java"));
        BufferedWriter out = new BufferedWriter (new FileWriter("TesClass3.java"))) {
          String line = null;
          while((line = in.readLine()) != null) {
            System.out.println(line);
            out.write(line);
            out.newLine();
          }
        } catch(IOException e) {
      System.out.println(e);
    }
    
    
   }  
}
