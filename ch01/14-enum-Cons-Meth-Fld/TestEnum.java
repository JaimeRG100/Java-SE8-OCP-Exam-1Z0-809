public class TestEnum {
  public static void main(String[] args) {
    Season.SUMMER.printExpectedVisitors();
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
  
}