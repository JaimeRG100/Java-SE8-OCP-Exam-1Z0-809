import java.time.ZoneId;

public class TestClass {

  public static void main(String[] args) {
    
    // print full list unformatted
    java.util.Set<String> set = ZoneId.getAvailableZoneIds();
    System.out.println(set);
    
    // print filtered list (with Stream)
    ZoneId.getAvailableZoneIds().stream()
      .filter(z -> z.contains("US") || z.contains("America"))
      .sorted().forEach(System.out::println);
    
    // print filtered list (with for)
    for(String s: ZoneId.getAvailableZoneIds())
      if (s.contains("America")) 
        System.out.println("-> " + s);

  }
}
