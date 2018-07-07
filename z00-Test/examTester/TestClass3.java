import java.sql.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.concurrent.*;
import java.time.*;

public class TestClass3 implements Runnable {   
  int x = 0, y = 0;
  public void run()    {
    while(true)       {          
      synchronized(this)          {
        x++; y++;
        System.out.println(" x = "+x+" , y = "+y);         
      }       }    }
  
  public static void main(String[] args)    {     
    TestClass3 tc = new TestClass3();    
    new Thread(tc).start();     
    new Thread(tc).start();  
  }
}