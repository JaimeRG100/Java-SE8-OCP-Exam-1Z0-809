import java.sql.*; 

public class TestClass {
  public static void main(String[] args) {
    
    try (Connection con = DriverManager.getConnection("jdbc:derby://local/zoo")) {
      System.out.println("Connected");
    } catch(SQLException e) {
      System.out.println(e);  // SQLException: No suitable driver found
    }
    
    try (Connection con = DriverManager.getConnection("jdbc:derby://123456/zoo")) {
      System.out.println("Connected");
    } catch(SQLException e) {
      System.out.println(e);  // SQLException: No suitable driver found
    }
    
    try (Connection con = DriverManager.getConnection("jdbc;derby;thin;/localhost/zoo")) {
      System.out.println("Connected");
    } catch(SQLException e) {
      System.out.println(e);  // SQLException: No suitable driver found
    }
  }
}