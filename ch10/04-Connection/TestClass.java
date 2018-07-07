import java.sql.*; 

public class TestClass {
  public static void main(String[] args) throws SQLException {
    Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
    System.out.println(conn);
  }
}

/*
OUTPUT (COMPILING WITHOUT ARGUMENTS):
------------------------------------
java.sql.SQLException: No suitable driver found for jdbc:derby:zoo

OUTPUT (java ?cp "<JAVA_HOME>\db\lib\derby.jar;." TestClass)
------------------------------------------------------------
org.apache.derby.impl.jdbc.EmbedConnection@24264240 (XID = 264), (SESSIONID = 1)
, (DATABASE = zoo), (DRDAID = null)
 */