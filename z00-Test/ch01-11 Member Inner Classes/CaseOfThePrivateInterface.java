public class CaseOfThePrivateInterface {
  private interface Secret {
    void shh();
  }
  class DontTell implements Secret {
    public void shh() {
      System.out.println("The secret is ...");
    }
  }
  
  public static void main(String[] args) {
    Secret s1 = new CaseOfThePrivateInterface().new DontTell();
    s1.shh();
    
    CaseOfThePrivateInterface c = new CaseOfThePrivateInterface();
    Secret s2 = c.new DontTell();
    s2.shh();
    
    CaseOfThePrivateInterface.Secret s3 = new CaseOfThePrivateInterface().new DontTell();
    s3.shh();
    
  }
}
