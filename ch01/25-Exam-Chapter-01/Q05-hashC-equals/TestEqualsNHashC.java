public class TestEqualsNHashC {
  
  public static void main(String[] args) {
    String a = "abc";
    String b = "abc";
    System.out.println(a.equals(b) + " : " + a.hashCode() + " : " + b.hashCode());
    
    System.out.println("Aa" .hashCode());
    System.out.println("BB" .hashCode());
  }
}