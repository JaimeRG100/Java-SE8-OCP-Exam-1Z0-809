public class TestPrivateInterface {

  public static void main(String[] args) {
    //CaseOfThePrivateInterface.Secret s1 = null;  // private
    new CaseOfThePrivateInterface().new DontTell().shh();
    
  }
}
