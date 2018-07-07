import java.io.*;

public class Bird implements Serializable {
  private String name;
  private transient int age;
  private Tail tail;
  public String getName() { return name; }
  public Tail getTail() { return tail; }
  public void setName(String name) { this.name = name; }
  public int getAge() { return age; }
  public void setAge(int age) { this.age = age; }
  public static void main(String[] args) {
    /*
    Bird b = new Bird();
    b.setName("birdy");
    b.setAge(3);
    try(ObjectOutputStream out = new ObjectOutputStream( new BufferedOutputStream(new FileOutputStream("birds.dat")))) {
      out.writeObject(b);
    } catch( IOException e) {
    } 
    */      
    try (ObjectInputStream is = new ObjectInputStream( new BufferedInputStream(new FileInputStream("birds.dat")))) {
      Bird bird = (Bird) is.readObject();
      System.out.println(bird.getName());
      System.out.println(bird.getAge());
    } catch (IOException | ClassNotFoundException e) {
      System.out.println(e);
    }
  }
  
}
class Tail {
}


/*

    try(InputStream is = new ObjectInputStream(
                                               new BufferedInputStream(new FileInputStream("birds.dat")))) {
      Bird bird = is.readObject();
    }
  }
}


import java.io.*;
public class Tail {}
public class Bird implements Serializable {
  private String name;
  private transient int age;
  private Tail tail;
  
  public String getName() { return name; }
  public Tail getTail() { return tail; }
  public void setName(String name) { this.name = name; }
  public void setTail(Tail tail) { this.tail = tail; }
  public int getAge() { return age; }
  public void setAge(int age) { this.age = age; }
  
  public void main(String[] args) {
*/