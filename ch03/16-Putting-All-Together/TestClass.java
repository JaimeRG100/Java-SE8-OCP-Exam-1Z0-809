import java.util.*;

public class TestClass {
   
  public static void main(String[] args) {
    
    List<?> list1 = new ArrayList<A>();
    List<? extends A> list2 = new ArrayList<A>();
    List<? super A> list3 = new ArrayList<A>();
    //List<? extends B> list4 = new ArrayList<A>();    // Does not compile
    List<? super B> list5 = new ArrayList<A>();
    //List<?> list6 = new ArrayList<? extends A>();    // Does not compile
    
    // test code
    List<String> myList = new ArrayList<String>();
    myList.add("one");
    System.out.println(method1(myList));    
  }
  
  static<T> T method1 (List<T> list) {
    return list.get(0);
  }
  
  //<T> <? extends T> method2(List<? extends T> list) {   // Does not compile
  //}
  
  //<B extends A> B method3(List<B> list) {
  //  return new B();                                       // Does not compile
  //}
  
  void method4(List<? super B> list) {    
  }
  
  //<X> void method5(List<X super B> list) {                   // Does not compile
  //}
  
  
}

class A {}
class B extends A {}
class C extends B {}