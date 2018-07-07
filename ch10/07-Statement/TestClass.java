import java.sql.*;

public class TestClass {
  public static void main(String[] args) throws SQLException {
    Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
    Statement stmt1 = conn.createStatement();
    Statement stmt2 = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY); // Default values / most commond used
    
    System.out.println("\nResultSet (TYPE_ and CONCUR_ values");
    System.out.println("-----------------------------------");
    System.out.println("TYPE_FORWARD_ONLY: " + java.sql.ResultSet.TYPE_FORWARD_ONLY);
    System.out.println("TYPE_SCROLL_INSENSITIVE: " + java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE);
    System.out.println("TYPE_SCROLL_SENSITIVE: " + java.sql.ResultSet.TYPE_SCROLL_SENSITIVE);
    System.out.println("CONCUR_READ_ONLY: " + java.sql.ResultSet.CONCUR_READ_ONLY);
    System.out.println("CONCUR_UPDATABLE: " + java.sql.ResultSet.CONCUR_UPDATABLE);
  }
}

/* OUTPUT WITH java -cp ... COMMAND

jdk1.8.0_151\db\lib\derby.jar;." TestClass

ResultSet (TYPE_ and CONCUR_ values
-----------------------------------
TYPE_FORWARD_ONLY: 1003
TYPE_SCROLL_INSENSITIVE: 1004
TYPE_SCROLL_SENSITIVE: 1005
CONCUR_READ_ONLY: 1007
CONCUR_UPDATABLE: 1008
*/