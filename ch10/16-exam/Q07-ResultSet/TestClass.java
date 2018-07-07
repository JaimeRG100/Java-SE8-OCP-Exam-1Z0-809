import java.sql.*;

public class TestClass {
  
  public void stmt(Connection conn, int b) throws SQLException {
    Statement stmt1 = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, b);
    Statement stmt2 = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, b);
    Statement stmt3 = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, b);
  }
  
  public static void main(String[] args) throws SQLException {
    // test code
    Connection conn = DriverManager.getConnection("jdbc:derby:../zoo");
    new TestClass().stmt(conn, 1007);
    System.out.println(ResultSet.CONCUR_READ_ONLY);
  }
}

/*command line
java -cp "C:\Program Files\Java\jdk1.8.0_151\db\lib\derby.jar;." TestClass
*/