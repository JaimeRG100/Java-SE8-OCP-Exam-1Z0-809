public interface Fly {
  // abstract
  String toLand();
  // static final constants
  int height = 10;
  // static method
  static void takeOff() {
    System.out.println("takeOff");
  }
  // default method
  default boolean fly(){ return false; }  
}