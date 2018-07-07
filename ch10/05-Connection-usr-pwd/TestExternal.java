import java.sql.*; 

public class TestExternal {
  public static void main(String[] args) throws SQLException {
    Connection conn = DriverManager.getConnection(
       "jdbc:derby:zoo",
       "username",
       "password");
    System.out.println(conn);
    Statement stm = conn.createStatement();
    ResultSet rs = stm.executeQuery("SELECT * from animal");
  }
}

/* OUTPUT:
----------
org.apache.derby.impl.jdbc.EmbedConnection@24264240 (XID = 265), (SESSIONID = 1)
, (DATABASE = zoo), (DRDAID = null)

[...] Exception in thread "main" java.sql.SQLSyntaxErrorException: El esquema 'USERNAME' no existe. [...] 
*/