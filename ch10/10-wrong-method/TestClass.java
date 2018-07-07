import java.sql.*;

public class TestClass {
  
  public static void main(String[] args) throws SQLException {
    Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
    Statement stmt = conn.createStatement();
    int result = stmt.executeUpdate("SELECT * FROM animal");  // throws Exception
    /*Exception ...SQLException: No sepuede llamar a Statement.executeUpdate() con una sentencia que devuelve un ResultSet*/
  }
}