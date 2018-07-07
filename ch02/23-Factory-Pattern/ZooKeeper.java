public class ZooKeeper {
    
  public static void main(String... args) {
    final Food food = FoodFactory.getFood("polar bear");
    food.consumed();
    
    // test code
    System.out.println("- - - - - ");
    Food food1 = FoodFactory.getFood("zebra");
    if(food1 instanceof Hay) System.out.println("Hay");
    food1 = FoodFactory.getFood("rabbit");
    if(food1 instanceof Pellets) System.out.println("Pellets");
    food1 = FoodFactory.getFood("goat");
    if(food1 instanceof Pellets) System.out.println("Pellets");
    food1 = FoodFactory.getFood("polar bear");
    if(food1 instanceof Fish) System.out.println("Fish");
  }
  
}