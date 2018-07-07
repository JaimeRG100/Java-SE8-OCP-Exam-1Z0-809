import java.sql.*;

public class TestClass {
  
  public static void main(String args[]) throws SQLException {
    Connection conn = DriverManager.getConnection("jdbc:derby:zoo");    
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM animal");
    rs.beforeFirst();
    rs.absolute(0);
  }
}