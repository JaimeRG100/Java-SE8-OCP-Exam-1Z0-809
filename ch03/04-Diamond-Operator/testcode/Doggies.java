import java.util.*;

public class Doggies {
  List<String> names;                     // bad encapsulation
  
  Doggies(ArrayList<String> list) {
    names = list;                         // bad encapsulation
    //names = new ArrayList<>(list);      // good encapsulation
  }
  
  //Doggies(ArrayList<> list, int x) {    //Error: illegal start of type
  //}
  
  public static void main (String args[]) {
    ArrayList<String> list = new ArrayList<>(Arrays.asList(new String[]{"one","two"}));
    list.add("three");
    Doggies doggies = new Doggies(list);
    System.out.println(doggies.names);
    list.add("four");
    list.add("five");
    System.out.println(doggies.names);     // shows bad encapsulation
  }
}