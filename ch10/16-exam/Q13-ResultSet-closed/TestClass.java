import java.sql.*;

//There are currently 100 rows in the table species before inserting a new row. 
//What is the output of the following code?
public class TestClass {

  public static void main(String[] args) throws SQLException {
    try (Connection conn = DriverManager.getConnection("jdbc:derby:../zoo");
         Statement stmt = conn.createStatement()) {
           ResultSet rs = stmt.executeQuery("select count(*) from species");
           int num = stmt.executeUpdate("INSERT INTO species VALUES (3, 'Ant', .05)");
           num = stmt.executeUpdate("DELETE FROM species WHERE id = 3");
           rs.next();  // throws SQLException: ResultSet no se ha abierto. La operación 'next' no está permitida.
           System.out.println(rs.getInt(1));
    }
  }
}

/*command line
java -cp "C:\Program Files\Java\jdk1.8.0_151\db\lib\derby.jar;." TestClass
*/