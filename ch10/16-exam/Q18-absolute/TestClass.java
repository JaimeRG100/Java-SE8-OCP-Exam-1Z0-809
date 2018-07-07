import java.sql.*;

//Suppose that you have a table with three rows. The names in those rows are 
// Anna, Betty, and Cat. What does the following output?
public class TestClass {

  public static void main(String[] args) throws SQLException { 
    String sql = "SELECT name FROM animal ORDER BY id";
    try (Connection conn = DriverManager.getConnection("jdbc:derby:../zoo");
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(sql)) {
           rs.absolute(0);  // throws SQLException: El método 'absolute()' sólo es tá permitido en cursores de desplazamiento.
           rs.next();
           System.out.println(rs.getString(1));
         }
  }
}

/*command line
java -cp "C:\Program Files\Java\jdk1.8.0_151\db\lib\derby.jar;." TestClass
*/
