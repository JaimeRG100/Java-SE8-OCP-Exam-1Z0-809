public class Bobcat {
  public Number findDen(Integer x) { return 2; }
  
  public static void main(String[] args) {
    Bobcat b = new BobcatKitten();
  }
}


class BobcatKitten extends Bobcat {
  @Override
  public Integer findDen(Integer x) { return 1; }
  public Integer findDen(Long x) { return 1; }
  public Integer findDen(long x) { return 1; }
  
  
  //@Override
  public void findDen(boolean b) { }
  
  //@Override
  public int findden() throws Exception { return 0; }
}