import java.io.*;
import java.util.*;

public class ObjectStreamSample {
  
  public static List<Animal> getAnimals(File dataFile) throws IOException, ClassNotFoundException {
    List<Animal> animals = new ArrayList<>();
    try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(dataFile)))) {
      Object object;
      while(true) {
        object = in.readObject();
        if(object instanceof Animal)
          animals.add((Animal)object);
      }
    } catch (EOFException e) {
      // File end reached
    }
    return animals;
  }
  
  public static void createAnimalsFile(List<Animal> animals, File dataFile) throws IOException {
    try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)))) {
      for(Animal animal: animals) {
        out.writeObject(animal);
      }
    }
  }
  
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    List<Animal> animals = new ArrayList<Animal>();
    animals.add(new Animal("Tommy Tiger", 5, 'T'));
    animals.add(new Animal("Peter Penguin", 8, 'P'));
    
    File dataFile = new File("animal.data");
    createAnimalsFile(animals, dataFile);
    System.out.println(getAnimals(dataFile));
    
  }
}