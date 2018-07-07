class SeasonTest2 {
  public static void main (String[] str) {
    Season2 s2 = Season2.WINTER;
    System.out.println("- - - - - -");
    System.out.println(s2.getValue());
    System.out.println("- - - - - -");
    for(Season2 season: Season2.values()) {
      System.out.println(season.getValue() + ":" + season.name() + ":" + season.ordinal());
    }
    System.out.println("- - - - - -");
    Season2 s3 = Season2.WINTER;
  }
}

enum Season2 {
  WINTER("Wint"),
    SPRING ("Sprin"), 
    SUMMER ("Summ"), 
    FALL ("Fal");
  String value;
  private Season2(String value) {
    this.value = value;
    System.out.println("initializing");
  }
  public String getValue() { 
    return value; }
}

