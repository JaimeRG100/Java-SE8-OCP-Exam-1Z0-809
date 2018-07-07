import java.util.*;
import java.util.stream.*;
import java.io.*;

class Runner implements Runnable{
  
  public void run() {
    for(int i = 0 ; i < 10; i++) 
      System.out.println("running " + i);
  }
  

  public static void main(String[] args) {
    System.out.println("start");
    new Thread(new Runnable() {
      public void run() {
        new Thread(new Runner()).start();
        for(int i = 0 ; i < 10; i++) 
          System.out.println("running fast " + i);
        
      }
    }).start();
    System.out.println("end");
  }
}