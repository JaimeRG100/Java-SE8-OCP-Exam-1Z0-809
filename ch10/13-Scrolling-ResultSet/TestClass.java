import java.sql.*; 

public class TestClass {
  
  public static void main(String[] args) throws SQLException{
    Connection conn = DriverManager.getConnection("jdbc:derby:../zoo");
    
    { // beforeFirst() afterLast()  previous() next() first() last()
      //-----------------------------------------------------------
      Statement stmt = conn.createStatement(
         ResultSet.TYPE_SCROLL_INSENSITIVE,
         ResultSet.CONCUR_READ_ONLY);
      ResultSet rs = stmt.executeQuery("SELECT id FROM species ORDER BY id");
      rs.afterLast();
      System.out.println(rs.previous()); // true
      System.out.println(rs.getInt(1));  // 2
      System.out.println(rs.previous()); // true
      System.out.println(rs.getInt(1));  // 1
      System.out.println(rs.last());     // true
      System.out.println(rs.getInt(1));  // 2
      System.out.println(rs.first());    // true
      System.out.println(rs.getInt(1));  // 1
      rs.beforeFirst();
      //System.out.println(rs.getInt(1));// throws SQLException
      System.out.println("- - - -");
    }
    
    { //empty rows-------------------------------------------------
      //-----------------------------------------------------------
      Statement stmt = conn.createStatement(
        ResultSet.TYPE_SCROLL_INSENSITIVE,
        ResultSet.CONCUR_READ_ONLY);
      ResultSet rs = stmt.executeQuery("SELECT id FROM species WHERE id = -99");
      System.out.println(rs.first()); // false
      System.out.println(rs.last());  // false
      System.out.println("- - - -");
    }
    
    { //absolute() ------------------------------------------------
      //-----------------------------------------------------------
      Statement stmt = conn.createStatement(
        ResultSet.TYPE_SCROLL_INSENSITIVE,
        ResultSet.CONCUR_READ_ONLY);
      ResultSet rs = stmt.executeQuery("SELECT id FROM animal ORDER BY id");
      System.out.println(rs.absolute(2));      // true
      System.out.println(rs.getString("id"));  // 2
      System.out.println(rs.absolute(0));      // false
      System.out.println(rs.absolute(5));      // true
      System.out.println(rs.getString("id"));  // 5
      System.out.println(rs.absolute(-2));     // true
      System.out.println(rs.getString("id"));  // 4
      System.out.println("- - - -");
    }
    
    { // relative()------------------------------------------------
      //-----------------------------------------------------------
      Statement stmt = conn.createStatement(
        ResultSet.TYPE_SCROLL_INSENSITIVE,
        ResultSet.CONCUR_READ_ONLY);
      ResultSet rs = stmt.executeQuery("SELECT id FROM animal ORDER BY id");
      System.out.println(rs.next());          // true
      System.out.println(rs.getString("id")); // 1
      System.out.println(rs.relative(2));     // true
      System.out.println(rs.getString("id")); // 3
      System.out.println(rs.relative(-1));    // true
      System.out.println(rs.getString("id")); // 2
      System.out.println(rs.relative(4));     // false
      System.out.println("- - - -");
    }
  }
}