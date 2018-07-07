import java.sql.*; 

public class TestClass {
  
  private static void weekDelete(Connection conn, String name) throws SQLException {
    Statement stmt = conn.createStatement();
    String sql = "DELETE FROM animal WHERE name = '" + name + "'";
    //stmt.executeUpdate(sql); // doesn't protected from SQL injection.
    System.out.println("DELETE FROM animal WHERE name = 'any'or 1 = 1 or name='any'");
  }
  private static void securedDelete(Connection conn, String name) throws SQLException {
    String sql = "DELETE FROM animal WHERE name = ?";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1, name);
    //ps.execute();
    System.out.println("DELETE FROM animal WHERE name = 'any\'or 1 = 1 or name=\'any'");
  }  
  
  public static void main(String[] args) throws SQLException {
    Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
    weekDelete(conn, "any'or 1 = 1 or name='any");
    securedDelete(conn, "any'or 1 = 1 or name='any");
  }
}