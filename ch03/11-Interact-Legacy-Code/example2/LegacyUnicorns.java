class Dragon {}
class Unicorn {} 

public class LegacyUnicorns {
  public static void main(String[] args) {
    java.util.List<Unicorn> unicorns = new java.util.ArrayList<>();
    addUnicorn(unicorns);
    Unicorn unicorn = unicorns.get(0);       // java.lang.ClassCastException
  }
  
  private static void addUnicorn(java.util.List unicorn) {
    unicorn.add(new Dragon());   
  }
}