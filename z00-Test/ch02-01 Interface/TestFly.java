public class TestFly implements Fly, Fly2{
  
  static int v1 = 3;
  
  public void abstractMethod() { System.out.println("fly asbract CLASS"); }
  
  public void defaultMethod() { System.out.println("fly default CLASS"); }
  
  static String methodStatic() { return "fly1 static CLASS"; }
  
  public static void main(String[] args) {
    
    Fly fly = new TestFly();
    System.out.println(Fly.methodStatic());
    System.out.println(Fly2.methodStatic());
    System.out.println(fly.v1);
    fly.defaultMethod();
    fly.abstractMethod();
    System.out.println("- - - - - - -");
    
    TestFly tf = new TestFly();
    System.out.println(tf.methodStatic());
    System.out.println(tf.methodStatic());
    System.out.println(tf.v1);
    tf.defaultMethod();
    tf.abstractMethod();
    System.out.println("- - - - - - -");
    
    Fly2 fly2 = new TestFly();
    System.out.println(Fly.methodStatic());
    System.out.println(Fly2.methodStatic());
    System.out.println(fly2.v1);
    fly2.defaultMethod();
    fly2.abstractMethod();
    System.out.println("- - - - - - -");
  }
  
}

interface Fly {
  static int v1 = 1;
  static String methodStatic() { return "fly1 static"; }
  
  public abstract void abstractMethod();
  default void defaultMethod() { System.out.println("fly1 default"); }
}

interface Fly2 extends Fly {
  static int v1 = 2;
  static String methodStatic() { return "fly2 static"; }
  
  public abstract void abstractMethod();
  default void defaultMethod() { System.out.println("fly2 default"); }
}