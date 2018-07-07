/*public*/ interface Secret {
  String magic(double d);
}

public class MySecret implements Secret {
  public String magic(double d) {
    return "Poof";
  }
  
  // test code
  public static void main(String... args) {
    Secret secret = (e) -> "Poof";
    System.out.println(secret.magic(0.12));
    secret = (e) -> { String f = ""; return "poof";};
    System.out.println(secret.magic(0.12));    
  }
}