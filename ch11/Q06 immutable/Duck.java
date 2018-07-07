import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public final class Duck {
  private final String name;
  private final List<Duck> ducklings;
  public Duck(String name, List<Duck> ducklings) {
    this.name = name;
    this.ducklings = new ArrayList<Duck>(ducklings);
  }
  public String getName() { return name; }
  public List<Duck> getDucklings() { return new ArrayList<>(ducklings); }
  public String hasDucklings(Predicate<Duck> p) {
    return p.test(this) ? "Quack Quack": "";
  }
}
/*
B. Mark name and ducklings final.
C. Mark the Duck class final.
F. Replace the getDucklings() with a method (or methods) that do not give the callerdirect access to the List<Duck> ducklings.
*/