public class Crate<T> {
  private T contents;
  
  public T emptyCrate() {
    return contents;
  }
  
  public void packCrate(T contentes) {
    this.contents = contentes;
  }
  
  public static void main (String args[]) {
    Elephant elephant = new Elephant("dumbo");
    Crate<Elephant> crateForElephant = new Crate<>();
    crateForElephant.packCrate(elephant);
    Elephant inNewHome = crateForElephant.emptyCrate();
    System.out.println(inNewHome.getName());
    
    Crate<Zebra> crateForZebra = new Crate<>();
    
    Robot joeRobot = new Robot();
    Crate<Robot> robotCrate = new Crate<>();
    robotCrate.packCrate(joeRobot);
    // Ship to St.Lois
    Robot atDestination = robotCrate.emptyCrate();
    
  }
}

class Elephant { 
  private String name;
  
  Elephant(String name) { this.name = name; }
  
  public String getName() { return name; }
}


class Zebra { }

class Robot {}