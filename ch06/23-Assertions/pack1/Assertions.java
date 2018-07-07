package pack1;

public class Assertions {

  public static void main(String[] args) {
    int numGuests = -5;
    assert numGuests > 0 : "hi";
    System.out.println(numGuests);    
  }
}