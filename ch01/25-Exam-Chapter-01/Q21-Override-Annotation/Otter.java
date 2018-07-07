public interface Otter {
  default void play(){}
}

class RiverOtter implements Otter {
  //INSERT CODE HERE
  @Override public boolean equals(Object o) { return false; }
  @Override public int hashCode() { return 42; }
  @Override public void play() {}
}