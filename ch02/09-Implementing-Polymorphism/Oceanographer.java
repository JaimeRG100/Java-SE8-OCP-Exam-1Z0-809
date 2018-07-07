public class Oceanographer {
  public void checkSound(LivesInOcean animal) {
    animal.makeSound();
  }
  public static void main(String[] args) {
    Oceanographer o = new Oceanographer();
    o.checkSound(new Dolphin());
    o.checkSound(new Whale());
    
    // test code
    System.out.println("- - - - - ");
    LivesInOcean[] animals = new LivesInOcean[3];
    animals[0] = new Dolphin();
    animals[1] = new Whale();
    animals[2] = new Dolphin();
    for(LivesInOcean animal: animals)
      animal.makeSound();
  }
}

/*public*/ interface LivesInOcean { 
  public void makeSound(); 
}

/*public*/ class Dolphin implements LivesInOcean {
  public void makeSound() { 
    System.out.println("whistle"); 
  }
}

/*public*/ class Whale implements LivesInOcean {
  public void makeSound() {
    System.out.println("sign");
  }
}
