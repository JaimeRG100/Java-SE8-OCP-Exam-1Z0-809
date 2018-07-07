import java.io.*;

public class ReadFileInformation {
  
  public static void readFileInfo(File file) {
    System.out.println("File Exists: " + file.exists());
    if(file.exists()) {
      System.out.println("Absolute Path: " + file.getAbsolutePath());
      System.out.println("Is Directory: " + file.isDirectory());
      System.out.println("Parent Path: " + file.getParent());
      if(file.isFile()) {
        System.out.println("File size: " + file.length());
        System.out.println("File LasModifies: " + file.lastModified());
      } else {
        for(File subf: file.listFiles()) {
          System.out.println(" > " + file.getName());
        }
    }
    }
  }
  
  public static void main(String[] args) {
    readFileInfo(new File("c:\\test\\zoo.txt"));
    System.out.println("- - - - - - - - - - ");
    readFileInfo(new File("c:\\test\\"));
    System.out.println("- - - - - - - - - - ");
    readFileInfo(new File("c:\\test\\ThiFilesDoesntExists.txt"));
    
    //test code
    //File file = new File("c:\\test\\test1.xlsx");
    //System.out.println(file.renameTo(new File("c:\\test\\test99.xlsx")));
    //File file = new File("c:\\test2\\");
    //System.out.println(file.delete());
    
  }
}