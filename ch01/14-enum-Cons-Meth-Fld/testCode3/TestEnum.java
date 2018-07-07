public class TestEnum {
  public static void main(String[] str) {
    Season s = Season.WINTER;
    System.out.println(s.str);
    //System.out.println(Season.str);  // Error: non-static variable str 
  }
  
}

enum Season {
  WINTER, SUMMER, SPRING, FALL;
  String str = "hello";
      
}