// Lazy instantiation

class VisitorTicketTracker {
  private static VisitorTicketTracker instance;
  
  private VisitorTicketTracker() {}
  
  public synchronized static VisitorTicketTracker getInstance() {
    if(instance == null) {
      instance = new VisitorTicketTracker();
    }
    return instance;
  }
}