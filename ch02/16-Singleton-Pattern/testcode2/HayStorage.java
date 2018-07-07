public class HayStorage {
  private int quantity = 0;
    
  private static final HayStorage instance = new HayStorage();
  
  private HayStorage() {}
  
  public static HayStorage getInstance() {
    return instance;
  }
  
  public synchronized void addHay(int amount) {
    quantity += amount;    
  }
  
  public synchronized boolean removeHay(int amount) {
    if (quantity < amount) return false;
    quantity -= amount;
    return true;
  }
  
  public synchronized int getQuantity() {
    return quantity;
  }
  
  public static void main(String... args) {
    HayStorage hs = HayStorage.getInstance();
    hs.addHay(100);
    System.out.println(hs.removeHay(150));
    System.out.println(hs.removeHay(40));
    System.out.println(hs.getQuantity());
  }
}