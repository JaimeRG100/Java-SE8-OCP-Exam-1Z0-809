/*public*/ enum Season {
  WINTER, SPRING, SUMMER, FALL
}


public class TestEnum {
  public static void main(String[] args)  {
    /* ENUM____________
     * .values()
     * .name()
     * .ordinal()
     * .valueOf(String)
     * */    
    Season s = Season.SUMMER;
    System.out.println(Season.SUMMER);
    System.out.println(s == Season.SUMMER);
    System.out.println("- - - - - - -");
    for(Season season: Season.values()) {
      System.out.println(season.name() + " " + season.ordinal());
    }
    System.out.println("- - - - - - -");
    for(Season season: s.values()) {
      System.out.println(season.name() + " " + season.ordinal());
    }
    System.out.println("- - - - - - -");
    //if (Season.SUMMER == 2) {} // DOES NOT COMPLIE
    Season s1 = Season.valueOf("SUMMER");
    //Season s2 = Season.valueOf("summer");  // java.lang.IllegalArgumentException: No enum constant Season.summer
    Season s3 = Season.valueOf("summer".toUpperCase());
  }
}

