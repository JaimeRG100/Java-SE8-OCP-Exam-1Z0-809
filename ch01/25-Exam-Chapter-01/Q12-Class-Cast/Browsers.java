public class Browsers {
  
  static class Browser {
    public void go(){
      System.out.println("Inside Browser");
    }
  }
  
  static class Firefox extends Browser {
    public void go(){
      System.out.println("Inside Firefox");
    }
  }
  
  static class IE extends Browser {
    public void go(){
      System.out.println("Inside IE");
    }
  }
  
  public static void main(String[] args) {
    Browser b = new Firefox();
    IE e = (IE) b;  // Compiles fine, but throws a ClassCastException
    e.go();
  }
}