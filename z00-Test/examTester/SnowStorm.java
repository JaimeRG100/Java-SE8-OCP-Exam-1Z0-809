import java.sql.*;


public class SnowStorm {
  private void readFromDatabase() throws SQLException { }
  public void read() throws SQLException {
    try {
      readFromDatabase();
    } catch (RuntimeException e) {
      throw e;
    }
  }
  
  
  static class Walk implements java.io.Closeable {
    public void close() throws IllegalStateException {
      throw new RuntimeException("snow");
    }
  }
  public static void main(String[] args) {
    try (Walk walk1 = new Walk(); Walk walk2 = new Walk();) {
      throw new RuntimeException("rain");
    } catch(RuntimeException e) {
      System.out.println(e.getMessage()
                           + " " + e.getSuppressed().length);
    } } }