class TestClass5 implements T1, T2{
   
   public void m1(){
   System.out.println(T1.VALUE);}
}
interface T1{
   int VALUE = 1;
   void m1();
}
interface T2{
   int VALUE = 2;
   void m1();
}