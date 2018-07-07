import java.util.*;

public class TestClass {
  
  public static void main(String[] args) {
    Season s = Season.WINTER;
    System.out.println("- - - - - - -");
    System.out.println(s);
    System.out.println(s.toString());
    System.out.println(s.name());
    System.out.println(s.ordinal());
    System.out.println("- - - - - - -");
    
    for(Season current: Season.values())
      System.out.println(current + ", " + current.name() + ", " + current.ordinal() + ", ");
    System.out.println("- - - - - - -");
    
    
    switch(s) {
      case WINTER:
      case SPRING: System.out.println("group1");
                   break;
      case SUMMER:
      case FALL: System.out.println("group1");
                 break;
    }
    System.out.println("- - - - - - -"); 
    
    Set<Season> set = new TreeSet<>();
    set.add(Season.FALL);
    set.add(Season.SUMMER);
    set.add(Season.WINTER);
    set.add(Season.SPRING);
    System.out.println(set);
    System.out.println("- - - - - - -");
    
    List<Season> list = new ArrayList<>();
    list.add(Season.FALL);
    list.add(Season.SUMMER);
    list.add(Season.WINTER);
    list.add(Season.valueOf("SPRING"));
    System.out.println(list);
    System.out.println("- - - - - - -");
    
    System.out.println(s.getX());
    System.out.println(Season.SPRING.getX());
    System.out.println(Season.SUMMER.getX());
    System.out.println(Season.FALL.getX());
    System.out.println("- - - - - - -");
    
    Season.WINTER.printMonths();
    Season.SPRING.printMonths();
    Season.SUMMER.printMonths();
    Season.FALL.printMonths();
    System.out.println("- - - - - - -");
    
    Season.WINTER.printHours();
    Season.SPRING.printHours();
    Season.SUMMER.printHours();
    Season.FALL.printHours();
  }
  
}

enum Season {
  WINTER(15) { public void printMonths() { System.out.println("Winter months"); } public void printHours() { System.out.println("Winter Hours"); } },
  SPRING(30) { public void printMonths() { System.out.println("Spring months"); } }, 
  SUMMER(45) { public void printMonths() { System.out.println("Summer months"); } }, 
  FALL(60)   { public void printMonths() { System.out.println("Fall months");   } };
  private int x;
  private Season(int x){
    this.x = x;
    System. out .println("constructing: " + x);
  }
  public int getX() { return x; }
  public abstract void printMonths();
  public void printHours() { System.out.println("Default Hours"); }
}






