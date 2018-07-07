import java.sql.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.concurrent.*;

class GoodWidget extends Widget{     String data = "big data";    
  public void doWidgetStuff() {         System.out.println(data);     } }
public class WidgetUser{    
  public static void main(String[] args) {         Widget w = new GoodWidget();         w.doWidgetStuff();     }     }


abstract class Widget {      String data = "data";     public void doWidgetStuff() {     }  }  



