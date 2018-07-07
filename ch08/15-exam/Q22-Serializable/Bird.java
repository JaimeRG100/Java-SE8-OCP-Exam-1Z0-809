import java.io.Serializable;
import java.io.*;

public class Bird implements Serializable {
  protected transient String name = "Bridget";
  public void setName(String name) { this.name = name; }
  public String getName() { return name; }
  public Bird() {
    this.name = "Matt";
  }
  public String toString() {
    return "<name: " + name + ">";
  }
  
  public static void main(String... args) {
    Bird bird = new Bird();
    bird.setName("Alex");
    try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("bird.data"));
         ObjectInputStream in = new ObjectInputStream(new FileInputStream("bird.data"))) {
      System.out.println("Before: " + bird);
      out.writeObject(bird);
      out.close();
      Bird bird2 = (Bird) in.readObject();
      System.out.println("After: " + bird2);
    } catch(IOException | ClassNotFoundException e) {
      System.out.println(e);
    }
  }
}