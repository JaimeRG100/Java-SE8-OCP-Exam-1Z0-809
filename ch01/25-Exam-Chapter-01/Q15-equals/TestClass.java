class TestClass {
  public int id;
  @Override public boolean equals(Object obj){
    if (obj == null) {
      System.out.print("null. ");
      return false;
    }
    if (!(obj instanceof TestClass)) {
      System.out.print("wrong type. ");
      return false;
    }
    return this.id == ((TestClass)obj).id;
  }
  
  public static void main(String[] args) {
    TestClass t1 = new TestClass();
    t1.id = 10;
    TestClass t2 = new TestClass();
    t2.id = 10;
    System.out.println(t1.equals(t2));
    t2.id = 11;
    System.out.println(t1.equals(t2));
    System.out.println("- - - - - ");
    System.out.println(t1.equals(null));  // if equals(null) is called, the method should return false
    String str = new String("hello");   
    System.out.println(t1.equals(str));   // if equals() is passed the wrong type, the method should return false
    
  }
}