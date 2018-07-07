public class BaseballTeam {
  private String city, mascot;
  private int numberOfPlayers;
  public boolean equals(Object obj) {
    if(!(obj instanceof BaseballTeam)) {
      return false; }
    BaseballTeam other = (BaseballTeam)obj;
    return (city.equals(other.city) && mascot.equals(other.mascot));
  }
  public int hashCode() {
    return numberOfPlayers;
  }
  // imagine getters and setters are here
  
  // test code
  public BaseballTeam(String city, String mascot, int numberOfPlayers) {
    this.city = city;
    this.mascot = mascot;
    this.numberOfPlayers = numberOfPlayers;
  }
  
  public static void main(String[] args) {
    BaseballTeam bt1 = new BaseballTeam("city1", "mascot1", 19);
    BaseballTeam bt2 = new BaseballTeam("city1", "mascot1", 23);
    System.out.println(bt1.equals(bt2));
    System.out.println(bt1.hashCode() + " : " + bt2.hashCode()); // this should return the same hashCode
                                                                 // for instances that are equals()
  }
}