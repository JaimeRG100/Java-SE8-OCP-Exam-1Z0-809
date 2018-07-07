import java.sql.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.concurrent.*;

public class WidgetUser{    
  public static void main(String[] args) {   
    Widget w = new GoodWidget();         w.doWidgetStuff();     }     }


abstract class Widget {      String data = "data";     public void doWidgetStuff() {     }  }  




class GoodWidget extends Widget{    
  public void doWidgetStuff() {         System.out.println(data);     } }
