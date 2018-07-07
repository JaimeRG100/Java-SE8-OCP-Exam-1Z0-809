import java.util.concurrent.*;


public class TicketManager {
  
  private TicketManager() { super(); }
  
  private static TicketManager instance;
  
  public static synchronized TicketManager getInstance() {
    if(instance == null) instance = new TicketManager();
    return instance;
  }
  
  private int tickets;
  
  public int getTicketCount() { return tickets;}
  
  public void makeTicketsAvailable(int value) { tickets += value;}
  
  public void sellTickets(int value) {
    synchronized (this) {
      tickets -= value;
    }
  }
  
  public static void main(String[] args) throws InterruptedException {
    ExecutorService service = Executors.newFixedThreadPool(20);
    TicketManager ticketMgr = TicketManager.getInstance();
    try {
      for(int i = 0; i<100; i++) 
        service.submit(() -> ticketMgr.makeTicketsAvailable(1)); // Not Thread-safe. Outputs 99 or 100
      Thread.sleep(300);
    } finally {
      if (service != null) service.shutdown();
    }
    System.out.println(ticketMgr.getTicketCount());
  }
}