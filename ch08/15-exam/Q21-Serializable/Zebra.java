import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class Zebra implements Serializable {
  private static final long serialUID = 1L;
  private transient String name = "George";
  private static String birthPlace = "Africa";
  private transient Integer age;
  private java.util.List<Zebra> friends = new java.util.ArrayList<>();
  private Object tail = null;
  { age = 10; }
  public Zebra() {
    this.name = "Sofia";
  }
  public Zebra(String name, String birthPlace, Integer age, List<Zebra> friends) {
    this.name = "Sofia";
    this.birthPlace = birthPlace;
    this.age = age;
    this.friends = new ArrayList<>(friends);
  }
  public String toString() {
    return "<name: " + this.name + ", birthPlace: " + birthPlace + ", age: " + age + ", friends: " + friends + ">";
  }
  
  public static void main(String[] args) {
    List<Zebra> list = new ArrayList<>();
    list.add(new Zebra());
    list.add(new Zebra());
    Zebra zebra = new Zebra("Jason", "Europe", 19, list);
    System.out.println(zebra);
    try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("zebra.data"));
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("zebra.data"))) {
      out.writeObject(zebra);
      Zebra zebra2 = (Zebra) in.readObject();
      System.out.println(zebra2);
    } catch (IOException | ClassNotFoundException e) {
      System.out.println(e);
    }
  }
}