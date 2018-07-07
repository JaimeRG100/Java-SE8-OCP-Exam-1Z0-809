public class CalculateAverage implements Runnable {
  private double[] scores;
  
  public CalculateAverage(double[] scores) {
    this.scores = scores;
  }
  
  public void run() {
    // Define work here that uses the score object
    for(int i=0; i<scores.length; i++) {
      System.out.println(scores[i]);
    }
  }
  
  public static void main(String[] agrs) {
    // test code
    new Thread(new CalculateAverage(new double[] {1.2, 2.3})).start();
    
    CalculateAverage ca = new CalculateAverage(new double[] {3.4, 4.5});
    new Thread(ca).start();
  }
}