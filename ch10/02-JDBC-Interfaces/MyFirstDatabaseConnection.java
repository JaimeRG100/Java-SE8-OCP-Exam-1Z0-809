import java.sql.*; 

public class MyFirstDatabaseConnection {
  public static void main(String[] args) throws SQLException {
    String url = "jdbc:derby:zoo";;
    try (Connection con = DriverManager.getConnection(url);
         Statement stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT name FROM animal")) {
           while (rs.next())
             System.out.println(rs.getString(1));
         }
  }
}