public class CheckResults {
  public static int counter = 0;
  
  public static void main(String[] args) {    
    new Thread(() -> {
               for(int i=0; i<10000000; i++) 
                 CheckResults.counter++;
    }).start();
    
    while(CheckResults.counter < 100) {
      System.out.println("not reached yet");
    }
    System.out.println("Reached!: " + CheckResults.counter);
  }
}