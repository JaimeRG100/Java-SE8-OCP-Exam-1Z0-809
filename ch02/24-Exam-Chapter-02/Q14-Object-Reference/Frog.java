/*public*/ interface CanHop { }

public class Frog implements CanHop {
  public static void main(String[] args) {
    Frog frog = new TurtleFrog();
    TurtleFrog frog2 = new TurtleFrog();
    CanHop frog3 = new TurtleFrog();
    Object frog4 = new TurtleFrog();
  }
}

/*public*/ class BazilianHornedFrog extends Frog {}
/*public*/ class TurtleFrog extends Frog {}