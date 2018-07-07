import java.sql.*;

public class TestClass {
  public static void main(String[] args) {
    try (Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
         Statement stmt = conn.createStatement()) {
           int result;
           // Example of executeUpdate() using INSERT, UPDATE and DELETE
           result = stmt.executeUpdate("INSERT INTO species VALUES (10, 'Deer', 3)");
           System.out.println(result); // 1
           result = stmt.executeUpdate("UPDATE species SET name = '' WHERE name = 'None'");
           System.out.println(result);  // 0
           result = stmt.executeUpdate("DELETE FROM species WHERE id = 10");
           System.out.println(result);  // 1
           System.out.println("------------");
           
           // Example of executeQuery() using SELECT
           ResultSet rs = stmt.executeQuery("SELECT * FROM species");
           while (rs.next()) 
             System.out.println(rs.getInt(1) + " - " + rs.getString(2) + " - " + rs.getDouble(3));
           System.out.println("------------");
           
           // Example of execute()
           String sql = "SELECT * FROM animal";
           //sql = "UPDATE animal SET name='Elsa' WHERE name='Elsa 2'";
           boolean isResultSet = stmt.execute(sql);
           if (isResultSet) {
             ResultSet rs2 = stmt.getResultSet();
             if (rs2.next())
               System.out.println("QUERY RESULT: " + rs2.getString(3));
           } else {
             int result2 = stmt.getUpdateCount();
             System.out.println("UPDATE RESULT: " + result2);
           }
           System.out.println("------------");
           
    } catch (SQLException e) {
      System.out.println(e);
    }
  }
}
/*OUTPUT:
1
0
1
------------
1 - African Elephant - 7.0
2 - Zebra - 1.0
------------
QUERY RESULT: Elsa
------------
*/