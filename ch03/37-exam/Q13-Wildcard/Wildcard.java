import java.util.*;

public class Wildcard { 
  public void showSize(List<?> list) {
    System.out.println(list.size());
  }
  
  public static void main(String[] args) {
    Wildcard card = new Wildcard();
    //ArrayDeque<?> list = new ArrayDeque<String>();      // incompatibe List <> Queue
    ArrayList<? super Date> list = new ArrayList<Date>();
    //List<?> list = new ArrayList<?>();  // unexpected type -> <?>
    //List<Exception> list = new LinkedList<java.io.IOException>();  // incompatible types <Exception> ~ <IOException>
    card.showSize(list);
    
    Vector<? extends Number> list2 = new Vector<Integer>();
    card.showSize(list2);
  }
}