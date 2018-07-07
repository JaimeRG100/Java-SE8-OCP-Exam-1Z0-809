// What is the result of the following program?
// D. The code does not compile because a method is not allowed to be both abstract and final.
// If final were removed, it outputs 'Text message to 1234567890'

public abstract class Message {
  public String recipient;
  public abstract final void sendMessage();
  
  public static void main(String[] args) {
    Message m = new TextMessage();
    m.recipient = "1234567890";
    m.sendMessage();
  }
  
  static class TextMessage extends Message {
    public final void sendMessage() {
      System.out.println("Text message to " + recipient);
    }
  }
}

/*
public abstract class Message {
  public String recipient;
  public abstract final void sendMessage();
  public static void main(String[] args) {
    Message m = new TextMessage();
    m.recipient = "1234567890";
    m.sendMessage();
  }
  static class TextMessage extends Message {
    public final void sendMessage() {
      System.out.println("Text message to " + recipient);
    }
  }
}
*/