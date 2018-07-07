public class Rectangle {
  private int width, height;
  
  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }
  
  public int getArea() {
    assert isValid(): "Not a valid Rectangle";
    return width * height;
  }
  
  private boolean isValid() {
    return ( width >= 0 && height >= 0);
  }
 
  public static void main(String[] args) {
    Rectangle one = new Rectangle(5, 12);
    Rectangle two = new Rectangle(-4, 10);
    System.out.println("Area one = " + one.getArea());
    System.out.println("Area two = " + two.getArea());
    
    // With assertios disabled (default)
    /* --------------------------------
    Area one = 60 
    Area two = -40 
    
    // With assertions enabled (command)
    /* ---------------------------------
    Area one = 60
    Exception in thread "main" java.lang.AssertionError: Not a valid Rectangle
        at Rectangle.getArea(Rectangle.java:10)
        at Rectangle.main(Rectangle.java:22)*/
  }
}


