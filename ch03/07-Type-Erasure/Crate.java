// For Generics, Behind the scenes, the compiler replaces all references to T in Crate with Object

public class Crate {
  private Object contents;
  
  public Object emptyCrate() {
    return contents;
  }
  
  public void packCrate(Object contentes) {
    this.contents = contentes;
  }
  
  public static void main (String args[]) {
    Elephant elephant = new Elephant();
    Crate crateForElephant = new Crate();
    crateForElephant.packCrate(elephant);
    Elephant inNewHome = (Elephant)crateForElephant.emptyCrate();
    
    Crate crateForZebra = new Crate();
    
    Robot joeRobot = new Robot();
    Crate robotCrate = new Crate();
    robotCrate.packCrate(joeRobot);
    // Ship to St.Lois
    Robot atDestination = (Robot)robotCrate.emptyCrate();
    
  }
}

class Elephant { }
class Zebra { }
class Robot { }