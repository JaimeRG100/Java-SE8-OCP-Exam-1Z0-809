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
  public static void main(String[] args) {
    
    
    LocalDateTime ldt = LocalDateTime.of(2017, 12, 02, 6, 0, 0);     
    ZonedDateTime nyZdt = ldt.atZone(nyZone); 
    ZonedDateTime laZdt = ldt.atZone(laZone);
    System.out.println(nyZdt);
    System.out.println(laZdt);
    Duration d = Duration.between(nyZdt, laZdt); 
    System.out.println(d);
    
    
  }
}