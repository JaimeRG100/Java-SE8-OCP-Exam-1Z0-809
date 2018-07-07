public class SizeLimitedCrate<T> {
  private T contents;
  private Integer sizeLimit;
  
  public SizeLimitedCrate(T contents, Integer sizeLimit) {
    this.contents = contents;
    this.sizeLimit = sizeLimit;
  }
  
  public static void main(String... args) {
    Elephant elephant = new Elephant();
    Integer numPounds = 15_000;
    SizeLimitedCrate<Elephant> c1 = new SizeLimitedCrate<>(elephant, numPounds);
    
  }
}

class Elephant {
}