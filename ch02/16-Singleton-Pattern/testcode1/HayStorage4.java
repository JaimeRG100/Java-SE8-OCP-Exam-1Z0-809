public class HayStorage4 {
  
  private int quantity;
  
  private static volatile HayStorage4 instance;
  
  private HayStorage4() {}
  
  public static HayStorage4 getInstance() {
    if (instance == null) { 
      synchronized(HayStorage4.class){
      if (instance == null) 
        instance = new HayStorage4();
      }
    }
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