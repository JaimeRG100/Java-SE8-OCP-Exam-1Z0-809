import java.sql.*;

// In a table animal with 10 rows, how many times does true get output by the following?
public class TestClass {

  public static void main(String[] args) throws SQLException { 
    String sql = "SELECT * FROM animal";
    try (Connection conn = DriverManager.getConnection("jdbc:derby:../zoo");
         Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
         ResultSet rs = stmt.executeQuery(sql)) {
           System.out.println(rs.absolute(0));    // false
           System.out.println(rs.absolute(5));    // true
           System.out.println(rs.previous());     // true
           System.out.println(rs.relative(-2));   // true
           System.out.println(rs.relative(-100)); // false
         }
  }
}

/*command line
java -cp "C:\Program Files\Java\jdk1.8.0_151\db\lib\derby.jar;." TestClass
*/
