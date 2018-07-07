import java.sql.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.concurrent.*;
import java.time.*;

public class TestClass2 {    
  public static void main(String[] args) {    
    Office off = new HomeOffice();  //1   
    System.out.println(off.getAddress()); //2 
} } 
interface House{   public default String getAddress(){      return "101 Main Str";   } }  interface Office {   public static String getAddress(){      return "101 Smart Str";   } }  interface WFH extends House, Office{ }  class HomeOffice implements House, Office{ 
  public String getAddress(){      return "R No 1, Home";   } 
}  
 