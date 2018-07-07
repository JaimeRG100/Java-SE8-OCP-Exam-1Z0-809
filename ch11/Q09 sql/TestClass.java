import java.sql.*;

public class TestClass {
  
  public void stmt(Connection conn, int a) throws SQLException {
    Statement stmt = conn.createStatement(a, ResultSet.CONCUR_READ_ONLY);
    Statement stmt2 = conn.createStatement(a, ResultSet.CONCUR_UPDATABLE);
  }
}