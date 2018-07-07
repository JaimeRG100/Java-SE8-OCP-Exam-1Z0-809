import java.sql.SQLException;

public class TestClass {
  
  public void read() throws SQLException {
    throw new SQLException();
  }
  
  public static void main(String[] args) {
    // test code
    //new TestClass().read();   // checked exception
  }
}