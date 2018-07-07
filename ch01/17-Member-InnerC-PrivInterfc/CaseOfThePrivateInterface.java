public class CaseOfThePrivateInterface {
  private interface Secret {
    public void shh();
  }
  
  class Donttell implements Secret {
    public void shh() { System.out.println("shh"); }
  }
  
  public static void main(String[] args) {
    CaseOfThePrivateInterface cotpi = new CaseOfThePrivateInterface();
    cotpi.new Donttell().shh();
    System.out.println("- - - - - - -");
    
    new CaseOfThePrivateInterface().new Donttell().shh();
  }
}