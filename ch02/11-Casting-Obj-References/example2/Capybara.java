public class Capybara extends Rodent {
  public static void main(String[] args) {
    Rodent rodent = new Rodent();
    // Capybara capybara = (Capybara) rodent;  // RUNTIME ClassCastException  { Parent = (Parent) child  XXX }
    
    if(rodent instanceof Capybara) {
      Capybara capybara = (Capybara) rodent;
    }
  }
}


/*public*/ class Rodent {
}