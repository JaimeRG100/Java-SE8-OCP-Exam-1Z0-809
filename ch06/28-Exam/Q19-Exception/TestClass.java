import java.sql.SQLException;

public class TestClass {
  public void read1() throws SQLException {
    try {
      readFromDatabase();
    } catch (Exception e) {
      throw e;
    }
  }
  
  public void read2() throws SQLException {
    try {
      readFromDatabase();
    } catch (RuntimeException e) {
      throw e;
    }
  }
  
  public void read3() throws SQLException {
    try {
      readFromDatabase();
    } catch (SQLException e) {
      throw e;
    }
  }
  
  public void read4() throws SQLException {
    try {
      readFromDatabase();
    } catch (SQLException | RuntimeException e) {
      throw e;
    }
  }
  
  private void readFromDatabase() throws SQLException { }
}

