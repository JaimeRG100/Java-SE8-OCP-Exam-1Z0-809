public class HayStorage {
  
  private int quantity;
  
  private static final HayStorage instance = new HayStorage();
  
  private HayStorage() {}
  
  public static HayStorage getInstance() {
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