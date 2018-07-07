import java.io.Serializable;

public class Animal implements Serializable{
  private static final long serialVersionUID = 1;
  private transient String name;
  private transient int age = 10;
  private static char type = 'C';
  
  { this.age = 14; }
  
  public Animal() {
    this.name = "Unknown";
    this.age = 12;
    this.type = 'Q';
  }
  
  public Animal(String name, int age, char type) {
    this.name = name;
    this.age = age;
    this.type = type;
  }
  
  public String getName() { return name; }
  public int getAge() { return age; }
  public char getType() { return type; }
  
  public String toString() {
    return "Animal [name=" + name + ", age=" + age + ", type=" + type + "]";
  }
  
  public static void main(String[] args) {
  }
}