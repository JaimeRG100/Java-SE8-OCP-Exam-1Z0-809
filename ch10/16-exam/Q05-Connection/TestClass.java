import java.sql.*;

//Suppose that you have a table named animal with two rows. What is the result of the following code?

public class TestClass {
  public static void main(String[] args) throws SQLException {
    
    String url = "jdbc:derby:../zoo";
    String userName = "userName";
    String password = "password";
    Connection conn = new Connection(url, userName, password);  // Does not compile
    //Connection conn = DriverManager.getConnection(url);  // test code
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT count(*) FROM animal");
    if (rs.next()) System.out.println(rs.getInt(1));
    
  }
}

/*command line
java -cp "C:\Program Files\Java\jdk1.8.0_151\db\lib\derby.jar;." TestClass
*/