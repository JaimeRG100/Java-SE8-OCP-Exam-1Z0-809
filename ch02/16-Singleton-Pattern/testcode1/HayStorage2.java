public class HayStorage2 {
  
  private int quantity;
  
  private static final HayStorage2 instance;
  
  static {
    instance = new HayStorage2();
  }
  
  private HayStorage2() {}
  
  public static HayStorage2 getInstance() {
    return instance;
  }
  
  public synchronized void addHay(int amount) {
    quantity += amount;
  }
  
  public synchronized boolean removeHay(int amount) {
    if(quantity < amount) return false;
    quantity -= amount;
    return true;
  }
  
  public synchronized int getQuantity() {
    return quantity;
  }
}