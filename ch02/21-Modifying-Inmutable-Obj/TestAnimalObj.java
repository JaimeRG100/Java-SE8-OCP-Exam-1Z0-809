import java.util.*;

class TestgAnimalObj {
  
  public static void main(String... args) {
    // Create a new Animal instance
    Animal lion = new Animal("lion", 5, Arrays.asList("metat","more meat"));
    
    // Create a new Animal instance using data from the first instance
    List<String> favoriteFoods = new ArrayList<String>();
    for(int i=0; i<lion.getFavoriteFoodsCount(); i++) {
      favoriteFoods.add(lion.getFavoriteFood(i));
    }
    
    // Creating a new inmutable object with information modified
    Animal updateLion = new Animal(lion.getSpecies(), lion.getAge()+1, favoriteFoods);
      
  }
}