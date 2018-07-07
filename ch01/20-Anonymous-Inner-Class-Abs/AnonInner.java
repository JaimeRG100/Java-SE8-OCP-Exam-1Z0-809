public class AnonInner {
  
  abstract class SaleTodayOnly {
    abstract int dollarsOff();
  }
  
  public int admission(int basePrice) {
    SaleTodayOnly sale = new SaleTodayOnly(){
      int dollarsOff() {return 3;}
    };
    
    return basePrice - sale.dollarsOff();
  }
  
  public static void main(String[] args) {
    System.out.println(new AnonInner().admission(20));
  }
}