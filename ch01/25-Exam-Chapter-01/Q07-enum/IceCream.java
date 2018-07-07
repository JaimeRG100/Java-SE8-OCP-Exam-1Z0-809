public class IceCream {
  enum Flavors {
    VANILLA, CHOCOLATE, STRAWBERRY
  }
  public static void main(String[] args) {
    Flavors f = Flavors.STRAWBERRY;
    switch (f) {
      /*  // This code doesn't compile
      case 0: System.out.println("vanilla");
      case 1: System.out.println("chocalte");
      case 2: System.out.println("strawberry");
      */
      case VANILLA: System.out.println("vanilla");
      case CHOCOLATE: System.out.println("chocalte");
      case STRAWBERRY: System.out.println("strawberry");
    }
  }
}