import java.sql.*;

public class TestClass {

  public static void main(String[] args) throws SQLException {
    Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
    Statement stmt = conn.createStatement();
    int result = stmt.executeUpdate("UPDATE animal set name = name");
    System.out.println(result); // 5
  }
}

/*command line
java -cp "C:\Program Files\Java\jdk1.8.0_151\db\lib\derby.jar;." TestClass
*/