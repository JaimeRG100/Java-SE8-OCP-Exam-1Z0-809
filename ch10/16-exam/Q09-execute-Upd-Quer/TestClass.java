import java.sql.*;

public class TestClass {

  public static void main(String[] args) throws SQLException {
    Connection conn = DriverManager.getConnection("jdbc:derby:../zoo");
    Statement stmt = conn.createStatement();
    String sql;
    
    sql = "SELECT * FROM animal";
    boolean bool = stmt.execute(sql);
    System.out.println(bool);
    
    sql = "UPDATE animal SET name = name";
    int num = stmt.executeUpdate(sql);
    System.out.println(num);
    
    sql = "SELECT * FROM animal";
    ResultSet rs = stmt.executeQuery(sql);
    while (rs.next())
      System.out.print(rs.getInt(1) + " " + rs.getString(3) + ", ");
    
  }
}

/*command line
java -cp "C:\Program Files\Java\jdk1.8.0_151\db\lib\derby.jar;." TestClass
*/