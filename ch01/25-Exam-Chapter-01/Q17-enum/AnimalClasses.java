public enum AnimalClasses {
  MAMMAL(true), FISH(Boolean.FALSE), BIRD(false),
    REPTILE(false), AMPHIBIAN(false), INVERTEBRATE(false); // missing semi colon (fixed)
  boolean hasHair;
  /*public*/ AnimalClasses(boolean hasHair){   // can not be public (fixed)
    this.hasHair = hasHair;
  }
  public void giveWig() {
    hasHair = true;
  }
}