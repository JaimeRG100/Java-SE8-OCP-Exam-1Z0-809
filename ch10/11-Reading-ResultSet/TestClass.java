import java.sql.*;
import java.util.Map;
import java.util.HashMap;

public class TestClass {
  
  public static void main(String[] args) throws SQLException {
    // getInt(String) getString(String)
    try(Connection conn = DriverManager.getConnection("jdbc:derby:../zoo");Statement stmt = conn.createStatement()) {
      Map<Integer, String> idToNameMap = new HashMap<>();
      ResultSet rs = stmt.executeQuery("SELECT id, name FROM species");
      while(rs.next()) {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        idToNameMap.put(id, name);
      }
      System.out.println(idToNameMap);  // {1=African Elephant, 2=Zebra}
    } catch (SQLException e) {
      System.out.println(e);
    }
    
    // getInt(int) getString(int)
    try(Connection conn = DriverManager.getConnection("jdbc:derby:../zoo"); Statement stmt = conn.createStatement()) {
      Map<Integer, String> idToNameMap = new HashMap<>();
      ResultSet rs = stmt.executeQuery ("SELECT id, name FROM species");
      while(rs.next()){
        int id = rs.getInt(1);
        String name = rs.getString(2);
        idToNameMap.put(id, name);
      }
      System.out.println(idToNameMap);  // {1=African Elephant, 2=Zebra}
    } catch (SQLException e) {
      System.out.println(e);
    }
    
    // retrieving only one row
    try(Connection conn = DriverManager.getConnection("jdbc:derby:../zoo"); Statement stmt = conn.createStatement()) {
      ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM animal");
      if(rs.next())
        System.out.println(rs.getInt(1)); // 5
    }
    
    try(Connection conn = DriverManager.getConnection("jdbc:derby:../zoo"); Statement stmt = conn.createStatement()) {
      ResultSet rs = stmt.executeQuery("SELECT COUNT(*) as count FROM animal");
      if(rs.next())
        System.out.println(rs.getInt("count")); // 5
        
    }
    
  }
}