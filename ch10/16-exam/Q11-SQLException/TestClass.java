import java.sql.*;

public class TestClass {

  public static void main(String[] args) {
    Connection conn = DriverManager.getConnection("jdbc:derby:../zoo");  // Does not compile: unreported SQLException
    Statement stmt = conn.createStatement();                             // Does not compile: unreported SQLException
    int result = stmt.executeUpdate("UPDATE animal SET name = name");    // Does not compile: unreported SQLException
    System.out.println(result);
  }
}

/*command line
java -cp "C:\Program Files\Java\jdk1.8.0_151\db\lib\derby.jar;." TestClass
*/