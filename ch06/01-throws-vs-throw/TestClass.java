import java.sql.SQLException;

public class TestClass {
  
  public String getDataFromDatabase() throws SQLException {
    throw new SQLException();
  }
  
  public static void main(String[] args) {
    
    //test code
    try {
      new TestClass().getDataFromDatabase();
    } catch (SQLException e) {
      System.out.println(e);
      //System.out.println(e.getMessage());
    } catch(UnsupportedOperationException e) {
      System.out.println(e);
      //System.out.println(e.getMessage());
    }
    
  }
}