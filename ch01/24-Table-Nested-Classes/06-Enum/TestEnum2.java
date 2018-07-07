public class TestEnum2 {
  public static void main(String[] args){
    Season s;
    for (Season season: Season.values()) {
      System.out.println(season.name() + " : " + season.ordinal() + " : " + season.describe());
      String str = season.name();
      s = Season.valueOf(str);
    }
    for (MoonPhases mp: MoonPhases.values()){
      System.out.println(mp.name() + " : " + mp.ordinal() + " : " + mp.printShape());
    }
    for (MatterPhases mtp: MatterPhases.values()){
      System.out.println(mtp.name() + " : " + mtp.ordinal() + " : " + mtp.printStatus());
    }
  }
  
}

enum Season {
  SPRING("begins on the spring equinox"), 
    SUMMER("begins on the summer solstice;"), 
    FALL("begins on the fall equinox"),
    WINTER("begins on the winter solstice");
  private String description;
  private Season(String value) { description = value;}
  public String describe(){ return description;}
}


enum MoonPhases {
  THIRD_QUARTER {String printShape() {return "_)";}},
    NEW_MOON {String printShape() {return "(X)";}},
    FIRS_QUARTER {String printShape() {return "(_";}},
    FULL_MOON {String printShape() {return "(_)";}};
    abstract String printShape();
}

enum MatterPhases {
  SOLID {public String printStatus() { return this.name() + ":" + " atoms are compressed"; }},
    LIQUID,
    GAS;
  public String printStatus() { return this.name() + ":" + " atoms are expanded"; }
}