import java.util.*;

public class TestClass {
  
  public static void main(String[] args) {
    {
      List<Integer> list = new ArrayList<>();
      list.add(1);
      list.add(2);
      list.add(3);
      list.add(0);
      list.add(4);
      System.out.println(list);
      list.remove(0);
      System.out.println(list);
      list.remove(new Integer(0));
      System.out.println(list);
    }
    
    {
      List<String> listQueue = new ArrayList<>(Arrays.asList("Air", "Bear", "Cool", "Do"));
      System.out.println(listQueue);
      listQueue.add("Fear");
      System.out.println(listQueue);
      listQueue.add(0, "#000");
      System.out.println(listQueue);
      listQueue.remove(0);
      System.out.println(listQueue);
      listQueue.remove(listQueue.size()-1);
      System.out.println(listQueue);
      listQueue.set(0, "Airport");
      System.out.println(listQueue);
    }
    
    {
      List<Animal> list = new ArrayList<>();
      list.add(new Animal("elephant"));
      list.add(new Animal("lion"));
      list.add(new Animal("horse").setName("zebra"));
      System.out.println(list);
      list.remove(new Animal("zebra"));
      System.out.println(list);
      
    }
  }
}

class Animal {
  private String name = "";
  
  public Animal(String name) { this.name = name; }
  public Animal setName(String name)  { this.name = name; return this; }
  public String getName() { return name; }
  public String toString() { return this.name; }
  public boolean equals(Object obj) {
    if (obj != null)
      if (obj instanceof Animal)
        return this.getName().equals(((Animal) obj).getName());
    return false;
  }
  public boolean equals2(Object obj) {
    if (obj == null)
      return false;
    else {
      if (obj instanceof Animal) {
        return this.getName().equals(((Animal) obj).getName());
      } else
        return false;
    }
    
  }
}