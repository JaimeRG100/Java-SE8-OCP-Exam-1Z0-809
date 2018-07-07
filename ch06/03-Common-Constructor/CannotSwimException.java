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
    //throw new CannotSwimException();
    
    // option 2
    //throw new CannotSwimException(new RuntimeException());
    
    //option 3
    //throw new CannotSwimException("broken fin");
  }
}