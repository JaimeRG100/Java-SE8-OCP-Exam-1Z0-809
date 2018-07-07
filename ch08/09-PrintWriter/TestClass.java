import java.io.*;

public class TestClass {
  public static void main(String[] args) throws FileNotFoundException, IOException {
    { // Example 1 of PrintWriter
      PrintWriter out = new PrintWriter("zoo.log");
      out.print(5);
      out.write(String.valueOf(5));
      out.print(2.0);
      out.write(String.valueOf(2.0));
      Animal animal = new Animal();
      out.print(animal);
      out.write(animal == null ? "null" : animal.toString());
      
      String separator = System.getProperty("line.separator");
      out.write(separator);
      out.write("hello");
      out.println("Java 8");
      out.println("2018");
      out.close();
    }
    
    { // Example 2 of PrintWriter
      File source = new File("zoo_2.log");
      try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(source)))) {
        out.print("Today's weather is: ");
        out.println("Sunny");
        out.print("Today's temperature at the zoo is: ");
        out.print(1/3.0);
        out.println('C');
        out.format("It has rained %.2f inches this year", 10.12);
        out.println();
        out.printf("It may ray %.2f more inches this year", 21.2);
      }
    }
    
  }
}

class Animal {
  private String name="default";  
  public String toString() { return name; }
}