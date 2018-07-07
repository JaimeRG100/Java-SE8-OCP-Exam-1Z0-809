import java.time.LocalTime;

class Random {
  
  public static double rnd() {
    return LocalTime.now().getSecond() / 60.0;
  }
  
  public static void main(String[] args) {
    System.out.println(Random.rnd());
  }
  
}