import java.util.*;

public class Generic<T> {
  
  public static void main(String[] args) {
    Generic<String> g = new Generic<>();
    Generic<Object> g2 = new Generic();
  }
}