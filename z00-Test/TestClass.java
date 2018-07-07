import java.util.*;
import java.util.stream.*;
import java.io.*;

class TestClass {
  

  public static void main(String[] args) {
    Zebra zebra = new Zebra();
    System.out.println(zebra);
    
    try(ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("zebra.data")))) {
      out.writeObject(zebra);
    } catch(IOException e) { }
    
    Zebra deserialized = null;
    try(ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("zebra.data")))) {
      Object obj = in.readObject();
      if (obj instanceof Zebra)
        deserialized = (Zebra) obj;        
    } catch(IOException | ClassNotFoundException e) { }
    
    System.out.println(deserialized);

  }
}