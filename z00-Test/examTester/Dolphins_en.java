import java.util.*;

public class Dolphins_en extends ListResourceBundle {
  
  protected Object[][] getContents() {
    return new Object[][] {
      {"name", "DolphingNameFromJava"},
      {"foods", new ArrayList<String>(Arrays.asList("food1", "food")) }
    };
  }
}

/*
public class Zoo_en extends ListResourceBundle {
  
  protected Object[][] getContents() {
    return new Object[][] {
      {"hello", "The Zoo is now Open for everyone"}, 
      {"Lion", new Lion("Zimba Lion")}
    };
  }
}
 */