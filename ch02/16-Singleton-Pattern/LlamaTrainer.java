public class LlamaTrainer {
  
  public boolean feedLlamas(int numberOfLlamas) {
    int amountNeeded = 5 * numberOfLlamas;
    HayStorage hayStorage = HayStorage.getInstance();
    if(hayStorage.getQuantity() < amountNeeded) {
      hayStorage.addHay(amountNeeded + 10);
    }
    boolean fed = hayStorage.removeHay(amountNeeded);
    if(fed) System.out.println("Llamas have been fed");
    System.out.println("(remaining hay: " + hayStorage.getQuantity() + ")");
    return fed;
  }
  
  // test code
  public static void main(String... args) {
    LlamaTrainer llamaTrainer = new LlamaTrainer();
    System.out.println(llamaTrainer.feedLlamas(10));
  }
}