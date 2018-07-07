import java.sql.*; 

public class TestClass {
  
  public static void main(String[] args) {
    String url = "jdbc:derby:../zoo";
    try (Connection conn = DriverManager.getConnection(url);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT not_a_column FROM animal")) {
    } catch (SQLException e) {
      System.out.println(e.getMessage());
      System.out.println(e.getSQLState());
      System.out.println(e.getErrorCode());
    }
    
  }
}
/*OUTPUT:
---------
La columna 'NOT_A_COLUMN' no est� en ninguna tabla de la lista FROM o aparece en
 una especificaci�n de uni�n y est� fuera del �mbito de la especificaci�n de uni
�n o bien aparece en una cl�usula HAVING y no est� en la lista GROUP BY. Si se t
rata de una sentencia CREATE o ALTER TABLE, 'NOT_A_COLUMN' no es una columna de
la tabla destino.
42X04
30000*/