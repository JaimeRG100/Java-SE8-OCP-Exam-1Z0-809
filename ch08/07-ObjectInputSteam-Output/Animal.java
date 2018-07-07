import java.io.Serializable;

public class Animal implements Serializable{
  private static final long serialVersionUID = 1;
  private String name;
  private int age;
  private char type;
  
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