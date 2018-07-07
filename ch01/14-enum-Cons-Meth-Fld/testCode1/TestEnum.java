public class TestEnum {
  public static void main(String[] args) {
    Season.SUMMER.printExpectedVisitors();
    System.out.println(Season.SPRING);
    Season s = Season.WINTER;
    System.out.println(s);
    System.out.println(s.FALL);
  }
}

enum Season {
  WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");
  
  private String expectedVisitors;
  
  private Season(String expectedVisitors) {
    this.expectedVisitors = expectedVisitors;
  }
  
  public void printExpectedVisitors() {
    System.out.println(expectedVisitors);
  }
  
  public String toString(){
    return expectedVisitors;
  }
  
}