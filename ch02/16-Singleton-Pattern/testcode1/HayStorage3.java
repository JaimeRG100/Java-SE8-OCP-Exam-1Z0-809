public class HayStorage3 {
  
  private int quantity;
  
  private static HayStorage3 instance;
  
  private HayStorage3() {}
  
  public synchronized static HayStorage3 getInstance() {
    if (instance == null) 
      instance = new HayStorage3();
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