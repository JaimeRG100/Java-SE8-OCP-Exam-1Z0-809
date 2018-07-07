public class VisitPark {
  enum AnimalsInPark {
    SQUIRREL, CHIPMUNK, SPARROW;
  }
  
  public static void main(String[] args) {
    AnimalsInPark[] values = AnimalsInPark.values();
    System.out.println(values[1]);
    System.out.println(values[1].ordinal());
  }
}