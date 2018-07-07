// Do not use assertions to check for valid arguments passed in to a method. 
// Use an IllegalArgumentException instead. 

public class Rectangle {
  private int width, height;
  
  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }
  
  public int getArea() {
    if (width < 0 || height < 0) 
      throw new IllegalArgumentException();
    return width * height;
  }
  
  public static void main(String[] args) {
    Rectangle one = new Rectangle(5, 12);
    Rectangle two = new Rectangle(-4, 10);  // throws RuntimeException (better than using assert)
    System.out.println("Area one = " + one.getArea());
    System.out.println("Area two = " + two.getArea());
  }
  
}