import java.sql.*;

// 20. In the table animal with 10 rows, how many times does true get output by the following?
public class TestClass {

  public static void main(String[] args) throws SQLException {
    String sql = "SELECT * FROM animal";
    try (Connection conn = DriverManager.getConnection("jdbc:derby:../zoo");
         Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
         ResultSet rs = stmt.executeQuery("")) {
           System.out.println(rs.beforeFirst());  // Does not compile  (void type)
           System.out.println(rs.absolute(5));
           System.out.println(rs.previous());
           System.out.println(rs.relative(-2));
           System.out.println(rs.afterLast());    // Does not compile  (void type)
    }
    
  }
}

/*command line
java -cp "C:\Program Files\Java\jdk1.8.0_151\db\lib\derby.jar;." TestClass
*/
