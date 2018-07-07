public class EqualsAndHash {
  
  public static void main(String[] args) {
    String str1 = new String("hello");
    String str2 = "hello";
    System.out.println(str1 == str2);
    System.out.println(str1.equals(str2));
    System.out.println(str1.hashCode() + " : " + str2.hashCode());
    str2 = "bye";
    System.out.println(str1.hashCode() + " : " + str2.hashCode());
    System.out.println("".hashCode() +  " : " +" ".hashCode());
    System.out.println("a".hashCode() +  " : " + "b".hashCode());
    System.out.println("ab".hashCode() +  " : " + "ba".hashCode());
    
  }
}