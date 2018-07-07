import java.sql.*; 

public class TestClass {
  
  public static void closeDbExample1() throws SQLException {
    // Java 7 
    String url = "jdbc:derby:../zoo";
    try (Connection conn = DriverManager.getConnection(url);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT name FROM animal")){
           while(rs.next()) 
             System.out.println(rs.getString(1));
    }
    System.out.println("- - - - -");
  }
  
  public static void closeDbExample2() throws SQLException {
    // Prior Java 7
    String url = "jdbc:derby:../zoo";
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    try {
      conn = DriverManager.getConnection(url);
      stmt = conn.createStatement();
      rs = stmt.executeQuery("SELECT name FROM animal");
      while (rs.next()) 
        System.out.println(rs.getString(1));
    } finally {
      try { rs.close(); } catch (SQLException e) { System.out.println(e); }
      try { stmt.close(); } catch (SQLException e) { System.out.println(e); }
      try { conn.close(); } catch (SQLException e) { System.out.println(e); }
    }
    System.out.println("- - - - -");
  }
  
  public static void closeDbExample3() throws SQLException {
    // JDBC automatically closes a ResultSet when you run another SQL statement from the same Statement.
    String url = "jdbc:derby:../zoo";
    try (Connection conn = DriverManager.getConnection(url);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT count(*) FROM animal")) {
           if (rs.next()) 
             System.out.println(rs.getString(1));
           ResultSet rs2 = stmt.executeQuery("SELECT count(*) FROM animal");
           if (rs2.next())
             System.out.println(rs2.getString(1));
     }
     System.out.println("- - - - -");
  }
  
  public static void main(String[] args) throws SQLException {
    closeDbExample1();
    closeDbExample2();
    closeDbExample3();
    
  }
}