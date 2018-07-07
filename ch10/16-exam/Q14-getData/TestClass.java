import java.sql.*;

public class TestClass {

  public static void main(String[] args) throws SQLException {
    try (Connection conn = DriverManager.getConnection("jdbc:derby:../zoo");
         Statement stmt = conn.createStatement(); 
         ResultSet rs = stmt.executeQuery("select * from animal")) {
           if(rs.next()) {
             String s = rs.getString(3);
             System.out.println(s);
             Object o = rs.getObject(3);
             String s2 = "";
             if (o instanceof String)
               s2 = (String) o;
             System.out.println(s2);               
           }
    }
  }
}

/*command line
java -cp "C:\Program Files\Java\jdk1.8.0_151\db\lib\derby.jar;." TestClass
*/