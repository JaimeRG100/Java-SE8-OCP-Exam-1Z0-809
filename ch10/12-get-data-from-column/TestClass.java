import java.sql.*; 

public class TestClass {
  
  public static void main(String[] args) throws SQLException {
    Connection conn = DriverManager.getConnection("jdbc:derby:../zoo");
    Statement stmt = conn.createStatement();
    
    { // java.sql.Date 
      ResultSet rs = stmt.executeQuery("SELECT date_born FROM animal WHERE name = 'Elsa'");
      if (rs.next()) {
        java.sql.Date sqlDate = rs.getDate(1);
        java.time.LocalDate localDate = sqlDate.toLocalDate();
        System.out.println(localDate); // 2001-05-06
      }
    }
    
    { // java.sql.Time
      ResultSet rs = stmt.executeQuery("SELECT date_born FROM animal WHERE name = 'Elsa'");
      if(rs.next()) {
        java.sql.Time sqlTime = rs.getTime(1);
        java.time.LocalTime localTime = sqlTime.toLocalTime();
        System.out.println(localTime); // 03:15
      } 
    }
    
    { // java.sql.Timestamp
      ResultSet rs = stmt.executeQuery("SELECT date_born FROM animal WHERE name = 'Elsa'");
      if(rs.next()) {
        java.sql.Timestamp sqlTimestamp = rs.getTimestamp(1);
        java.time.LocalDateTime localDateTime = sqlTimestamp.toLocalDateTime();
        System.out.println(localDateTime);  // 2001-05-06T03:15
      }
    }
    
    { // Object
      ResultSet rs = stmt.executeQuery("SELECT id, name FROM species");
      while(rs.next()) {
        Object idField = rs.getObject("id");
        Object nameField = rs.getObject("name");
        if (idField instanceof Integer) {
          int id = (Integer) idField;
          System.out.println(id); // 1 .. 2
        }
        if (nameField instanceof String) {
          String name = (String) nameField;  // African Elephant .. Zebra
          System.out.println(name);
        }
      }
    }
  }
}