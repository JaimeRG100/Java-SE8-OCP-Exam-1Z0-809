public abstract class Food {
  private int quantity;
  
  public Food(int quantity) {
    this.quantity = quantity;
  }
  
  public int getQuantity() {
    return quantity;
  }  
  
  public abstract void consumed();
}

/*public*/ class Hay extends Food {
  public Hay(int quantity) {
    super(quantity);
  }
  public void consumed() {
    System.out.println("Hay eaten: " + getQuantity());
  }
}

/*public*/ class Pellets extends Food {
  public Pellets(int quantity) {
    super(quantity);
  }
  
  public void consumed() {
    System.out.println("Pellets eaten: " + getQuantity());
  }
}

/*public*/ class Fish extends Food {
  public Fish(int quantity) {
    super(quantity);
  }
  
  public void consumed() {
    System.out.println("Fish eaten: " + getQuantity());
  }
}