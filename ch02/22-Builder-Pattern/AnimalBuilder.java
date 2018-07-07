import java.util.*;

public class AnimalBuilder {
  private String species;
  private int age;
  private List<String> favoriteFoods;
  
  public AnimalBuilder setAge(int age) {
    this.age = age;
    return this;
  }
  
  public AnimalBuilder setSpecies(String species) {
    this.species = species;
    return this;
  }
  
  public AnimalBuilder setFavoriteFoods(List<String> favoriteFoods) {
    this.favoriteFoods = favoriteFoods;
    return this;
  }
  
  public Animal build() {
    return new Animal(species, age, favoriteFoods);
  }
  
  // Implementing Builder Pattern:
  public static void main(String... args) {
    AnimalBuilder duckBuilder = new AnimalBuilder();
    duckBuilder
      .setAge(4)
      .setFavoriteFoods(Arrays.asList("algae","insects"))
      .setSpecies("flamingo");
    Animal duck = duckBuilder.build();
  }
  
}