class SeasonTest1 {
  public static void main (String[] str) {
    Season1 s1 = Season1.WINTER;
    System.out.println(s1.getValue());
    System.out.println(s1.SPRING.getValue());
    System.out.println(Season1.SUMMER.getValue());
    System.out.println(Season1.FALL.getValue());
    System.out.println("- - - - - ");
    System.out.println(s1.getStrName() + " ~ " + s1.name());
    System.out.println(s1.SPRING.getStrName() + " ~ " + s1.SPRING.name());
    System.out.println(Season1.SUMMER.getStrName() + " ~ " + Season1.SUMMER.name());
    System.out.println(Season1.FALL.getStrName() + " ~ " + Season1.FALL.name());
    String str1 = s1.getStrName();
    str1 = s1.name();
    System.out.println(str1 + ":" + str1.charAt(2));
    System.out.println("- - - - - ");
    for(Season season: Season.values()){
      System.out.println("-> " + season.name());
    }
  }
}

enum Season1 {
  WINTER {int getValue(){return 0;} String getStrName() {return "WINTER";}},
    SPRING {int getValue(){return 1;} String getStrName() {return "SPRING";}}, 
    SUMMER {int getValue(){return 2;} String getStrName() {return "SUMMER";}}, 
    FALL{int getValue(){return 3;} String getStrName() {return "FALL";}};
  abstract int getValue();
  abstract String getStrName();  
}

