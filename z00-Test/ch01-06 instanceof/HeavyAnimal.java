class HeavyAnimal { 
  public static void main(String[] args) {
    System.out.println(new Elephant() instanceof HeavyAnimal);
    System.out.println(new Hippo() instanceof HeavyAnimal);
    System.out.println(new HeavyAnimal() instanceof HeavyAnimal);
    
    //System.out.println(new Elephant() instanceof Hippo);
    Object elephantObj = new Elephant();
    System.out.println(elephantObj instanceof Hippo);
    
    System.out.println(new Elephant() instanceof Mother);
  }

}
class Hippo extends HeavyAnimal { }
class Elephant extends HeavyAnimal { }

interface Mother {}