import java.util.*;

// previous code
public final class Animal {
  
  private final String species;
  private final int age;
  private final List<String> favoriteFoods;
  
  public Animal(String species, int age, List<String> favoriteFoods) {
    this.species = species;
    this.age = age;
    if(favoriteFoods == null) {
      throw new RuntimeException("favoriteFoods is required");
    }
    this.favoriteFoods = new ArrayList<String>(favoriteFoods);
  }
  
  public String getSpecies() {
    return species;
  }
  
  public int getAge() {
    return age;
  }
  
  public int getFavoriteFoodsCount() {
    return favoriteFoods.size();
  }
  
  public String getFavoriteFood(int index) {
    return favoriteFoods.get(index);
  }
}