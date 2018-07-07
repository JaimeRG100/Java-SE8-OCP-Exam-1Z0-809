class EffectFinal {
  public void isItFinal() {
    int one = 20;  // effectively final
    int two = one;
    two++;
    int three; // effectively final
    if (one == 4) three = 3;
    else three = 4;
    int four = 4;
    class Inner { 
      Inner() {
        System.out.println(one);
        //System.out.println(two);
        System.out.println(three);
        //System.out.println(four);
      }
    }
    four = 5;
    new Inner();
  }
  
  public static void main(String[] args) {
    new EffectFinal().isItFinal();
  }
  
}