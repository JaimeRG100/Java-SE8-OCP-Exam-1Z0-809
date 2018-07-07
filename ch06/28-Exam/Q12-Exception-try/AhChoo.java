public class AhChoo {
  static class SneezeException extends Exception {}
  static class SniffleException extends SneezeException {}
  
  public static void main(String[] args) throws SneezeException {
    try {
      throw new SneezeException();
    } catch (SneezeException e) {
                                  // Option 1 .- Leave line blank
      e = new SneezeException();  // Option 2
      e = new SniffleException(); // Option 3
      throw e;
    }
  }
}