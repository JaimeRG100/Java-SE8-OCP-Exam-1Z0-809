import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

// Program to illustrate how to query a database
class DbQuery {
  public static void main(String[] args) {
// Get connection, execute query, get the result set
// and print the entries from the result rest
    try (Connection connection = DbConnector.connectToDb();
         Statement statement = connection.createStatement();         
         ResultSet resultSet = statement.executeQuery("SELECT * FROM animal")){
           int count = resultSet.getMetaData().getColumnCount();
           System.out.println("ID \td2 \tld3 \td4 ");
           while (resultSet.next()) {
             for(int i=1; i<=count; i++) {
               System.out.print(resultSet.getObject(i) + "\t");
             }
             System.out.println();
           }
         }
         catch (SQLException sqle) {
           sqle.printStackTrace();
           System.exit(-1);
         }
  }
}


class DbConnector {
  public static Connection connectToDb() throws SQLException {
    String url = "jdbc:derby:";
    String database = "../zoo";
    return DriverManager.getConnection(url + database);
  }
}