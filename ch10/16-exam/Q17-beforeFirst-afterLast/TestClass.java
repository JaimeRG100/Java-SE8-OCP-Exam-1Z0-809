import java.sql.*;

//Suppose that you have a table with three rows. The names in those rows are 
// Anna, Betty, and Cat. What does the following output?
public class TestClass {

  public static void main(String[] args) throws SQLException { 
    String sql = "SELECT * FROM animal";
    try (Connection conn = DriverManager.getConnection("jdbc:derby:../zoo");
         Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
         ResultSet rs = stmt.executeQuery(sql)) {
           rs.beforeFirst();
           rs.afterLast();
           // test code
           rs.previous();
           System.out.println(rs.getString(3));
           
    } 
  }
}

/*command line
java -cp "C:\Program Files\Java\jdk1.8.0_151\db\lib\derby.jar;." TestClass
*/