import java.sql.*; 

public class TestClass {
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
    Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
    System.out.println(conn);
    /* OUTPUT WITH java -cp ... COMMAND
     * org.apache.derby.impl.jdbc.EmbedConnection@24264240 (XID = 270), (SESSIONID = 1)
     * , (DATABASE = zoo), (DRDAID = null) */
    
    Class.forName("not.a.driver");  // throws lang.ClassNotFoundException
  }
}