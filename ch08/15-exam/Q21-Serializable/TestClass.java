import java.io.*; 

public class Zebra implements Serializable {
  private static final long serialUID = 1L;
  private transient String name = "George";
  private static String birthPlaca = "Africa";
  public static void main(String[] args) {}}

/*
public class Zebra implements Serializable {
private static final long serialUID = 1L;
private transient String name = "George";
private static String birthPlace = "Africa";
private transient Integer age;
private java.util.List<Zebra> friends = new java.util.ArrayList<>();
private Object tail = null;
{ age = 10;}
public Zebra() {
this.name = "Sophia";
}
}*/