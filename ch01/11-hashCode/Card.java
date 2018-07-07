public class Card {
  private String rank;
  private String suit;
  
  public Card(String r, String s) {
    if (r == null || s == null)
      throw new IllegalArgumentException();
    rank = r;
    suit = s;
  }
  
  public boolean equals(Object obj) {
    if ( !(obj instanceof Card)) return false;
    Card c = (Card) obj;
    return rank.equals(c.rank) && suit.equals(c.suit);
  }
  
  public int hashCode() {
    return rank.hashCode();
  }
  
  public static void main(String[] args) {
    Card card1 = new Card("9", "heart");
    Card card2 = new Card("9", "heart");
    System.out.println(card1.equals(card2));
    Card card3 = new Card("9", "club");
    System.out.println(card1.equals(card3));
    System.out.println(card1.hashCode());
    System.out.println(card2.hashCode());
    System.out.println(card3.hashCode());
    card3 = null;
    //System.out.println(card3.hashCode());  //java.lang.NullPointerException
  }
}