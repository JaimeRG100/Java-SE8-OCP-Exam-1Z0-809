import java.sql.*;

public class TestClass {

  public static void main(String[] args) throws SQLException { 
    try (Connection conn = DriverManager.getConnection("jdbc:derby:../zoo");
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT * FROM animal")) {
           if (rs.next()) {
             System.out.println(rs.getTimestamp(4));
             // test code
             System.out.println(rs.getTimestamp(4).toLocalDateTime().plus(java.time.Period.of(0,0,1)));
           }
     }
  }
}

/*command line
java -cp "C:\Program Files\Java\jdk1.8.0_151\db\lib\derby.jar;." TestClass
*/