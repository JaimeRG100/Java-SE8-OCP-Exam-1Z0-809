public class TestEnum {
  public static void main(String[] str) {
    Season s = Season.WINTER;
    s.printHours();
    s.SPRING.printHours();
    Season.SUMMER.printHours();
  }
  
}

enum Season {
  WINTER { 
    public void printHours() { System.out.println("9am-3pm"); }
  }, 
  SUMMER {
    public void printHours() { System.out.println("9am-7pm"); }
  },
  SPRING, FALL;
  public void printHours() { System.out.println("9am-5pm"); }
      
}