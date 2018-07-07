import java.util.*;

public class IsItFurry {
  static class Chipmunk { }
  public static void main(String[] args) {
    Chipmunk c = new Chipmunk();
    ArrayList<Chipmunk> l = new ArrayList<>();
    Runnable r = new Thread();
    int result = 0;
    if (c instanceof Chipmunk) result += 1;
    //if (l instanceof Chipmunk) result += 2;  // Error: incompatible types: java.util.ArrayList<IsItFurry.Chipmunk> cannot be converted to IsItFurry.Chipmunk
    if (r instanceof Chipmunk) result += 4;    // This line compile successful and doesn't throw error
    System.out.println(result);
  }
}