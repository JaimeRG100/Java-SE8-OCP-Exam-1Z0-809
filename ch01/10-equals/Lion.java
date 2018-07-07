public class Lion {
  private int idNumber;
  private int age;
  private String name;
  
  public Lion(int idNumber, int age, String name) {
    this.idNumber = idNumber;
    this.age = age;
    this.name = name;
  }
  
  @Override public boolean equals(Object obj) {
    if (obj == null) return false;
    if ( !(obj instanceof Lion)) return false;
    Lion otherLion = (Lion) obj;
    return this.idNumber == otherLion.idNumber;
  }
  
  public static void main(String[] args) {
    String s1 = new String("lion");
    String s2 = new String("lion");
    System.out.println(s1.equals(s2));
    StringBuilder sb1 = new StringBuilder("lion");
    StringBuilder sb2 = new StringBuilder("lion");
    System.out.println(sb1.equals(sb2));
    System.out.println(sb1.toString().equals(sb2.toString()));
    System.out.println("- - - - - - - ");
    Lion lionOne = new Lion(157, 12, "pumba");
    Lion lionTwo = new Lion(157, 12, "pumba");
    System.out.println(lionOne.equals(lionTwo));
    Lion lionThree = null;
    System.out.println(lionOne.equals(lionThree));    // false
    //System.out.println(lionThree.equals(lionOne));  // java.lang.NullPointerException
  }
}