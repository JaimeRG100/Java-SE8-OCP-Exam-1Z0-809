public class AnonInner {
  
  interface SaleTodayOnly {
    int dollarsOff();
  }
  
  public int pay() {
    return admission(20, new SaleTodayOnly() {
      public int dollarsOff(){
        return 3;
      }
    });
  }
  
  public int admission(int basePrice, SaleTodayOnly sale) {
    return basePrice - sale.dollarsOff();
  }
  
  public static void main(String[] args) {
    System.out.println(new AnonInner().pay());
  }
}