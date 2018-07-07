public class CannotSwimException extends Exception{
  
  public CannotSwimException() {
    super();
  }
  
  public CannotSwimException(Exception e) {
    super(e);
  }
  
  public CannotSwimException(String message) {
    super(message);
  }

  public static void main(String[] args) throws CannotSwimException {
    // option 1
    try {
      throw new CannotSwimException();
    } catch(CannotSwimException e) {
      e.printStackTrace();
    }
    
    System.out.println("- - - - - - - ");
    
    // option 2
    try {
      throw new CannotSwimException(new RuntimeException());
    } catch(CannotSwimException e) {
      e.printStackTrace();
    }
    
    System.out.println("- - - - - - - ");
    
    //option 3
    try {
      throw new CannotSwimException("broken fin");
    } catch(CannotSwimException e) {
      e.printStackTrace();
    }
  }
}