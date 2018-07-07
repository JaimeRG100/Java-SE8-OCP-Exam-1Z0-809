public class AnonInner {
  interface SaleTodayOnly {
    int dollarsOff();
  }
  
  public int admission(int basePrice) {
    int result = new SaleTodayOnly() {
      public int dollarsOff() {
        return 3;
      }
    }.dollarsOff();
    return basePrice - result;
  }
  
  public static void main(String[] args) {
    AnonInner anonInner = new AnonInner();
    System.out.println(anonInner.admission(28));
    
    SaleTodayOnly s = new SaleTodayOnly(){
      public int dollarsOff() { return 1; }
    };
    
    SaleTodayOnly r = () -> 2;
    
    System.out.println(s.dollarsOff());
    System.out.println(r.dollarsOff());
  }
}