import java.sql.*;

public class TestClass {
  
  public static void main(String[] args) throws SQLException {
    // java -cp "C:\Program Files\Java\jdk1.8.0_151\db\lib\derby.jar;." TestClass
    Connection con = DriverManager.getConnection("jdbc:derby:zoo");
    Statement stm = con.createStatement();
    ResultSet rs = stm.executeQuery("SELECT animal.name, species.name FROM animal, species WHERE animal.species_id = species.id");
    while (rs.next()){
      System.out.println(rs.getString(1) + " \t> " + rs.getString(2));
    }
    
  }
}