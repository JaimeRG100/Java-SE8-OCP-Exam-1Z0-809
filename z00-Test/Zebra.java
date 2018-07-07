public class Zebra implements java.io.Serializable {
  private static final long serialUID = 1L;
  private transient String name = "George";
  private static String birthPlace = "Africa";
  private transient Integer age;
  public java.util.List<Zebra> friends = new java.util.ArrayList<>();
  private Object tail = null;
  { age = 10;}
  public Zebra() {
    this.name = "Sophia";
  }
  public String toString() {
    return serialUID + ", " + name + ", " + birthPlace + ", " + age + ", " + friends;
  }
}