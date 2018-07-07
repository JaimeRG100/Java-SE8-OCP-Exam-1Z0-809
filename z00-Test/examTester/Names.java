import java.sql.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.concurrent.*;
import java.time.*;

class Names{   
  private List<String> list;    
  public List<String> getList() {  
    return list;    
  }
  public void setList(List<String> list) { 
    this.list = list;     
  }
  public void printNames(){  
    System.out.println(getList());   
  }
  public static void main(String[] args) { 
    List<String> list = Arrays.asList("Bob Hope",         "Bob Dole",         "Bob Brown"        );      
    Names n = new Names();     
    n.setList(list.stream().collect(Collectors.toList())); 
    n.getList().forEach((s) -> n.printNames());    
  }      
}