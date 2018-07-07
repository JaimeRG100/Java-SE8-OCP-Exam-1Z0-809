public class SizeLimitedCrate<T, U> {
  private T contents;
  private U sizeLimit;
  
  public SizeLimitedCrate(T contents, U sizeLimit) {
    this.contents = contents;
    this.sizeLimit = sizeLimit;
  }
  
  public static void main(String... args) {
    Elephant elephant = new Elephant();
    Integer numPounds = 15_000;
    SizeLimitedCrate<Elephant, Integer> c1 = new SizeLimitedCrate<>(elephant, numPounds);
    
  }
}

class Elephant {
}