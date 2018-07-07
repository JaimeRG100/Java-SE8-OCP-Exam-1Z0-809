public class JavaBeans {
  // properties are private
  private int age;
  private boolean bird;
  private int numChildren;
  
  // Getters for non-bolean properties begins wtih get
  public int getAge() {
    return age;
  }
  
  // Getters for bolean properties may begins wtih get or is
  public boolean isBird() {
    return bird;
  }
  
  // Setther nethods begins with set
  public void setAge(int age) {
    this.age = age;
  }
  
  // method name must have a prefix of set/get/is with the property name in Camel Case
  public void setNumChildren(int numChildren) {
    this.numChildren = numChildren;
  }
  
  
  
}