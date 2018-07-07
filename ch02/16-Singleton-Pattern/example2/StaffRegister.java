// Instantiation using a static block

public class StaffRegister {
  
  private static final StaffRegister instance;
  
  static {
    instance = new StaffRegister();
    // Perform aditional steps
  }
  
  private StaffRegister() {
  }
  
  public static StaffRegister getInstance() {
    return instance;
  }
  
  // Data access methods ...
  
  // test code
  public static void main(String... args) {
    StaffRegister staffRegister = StaffRegister.getInstance();
  }
  
}