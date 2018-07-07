public class Frog implements Swim, Hop {
  
  // test code
  
  void read(Swim s) { System.out.println("read(Swim)");  }
  void read(Hop h) { System.out.println("read(Hop)"); }
  void read(Frog f) { System.out.println("read(Frog)"); }
  void read(Object o) { System.out.println("read(Object)"); }
  
  public static void main(String[] args) {
    Swim s = new Frog();
    Hop h = new Frog();
    Frog f = new Frog();
    Object o = new Frog();
    f.read(s);
    f.read(h);
    f.read(f);
    f.read(o);
    
  }
}

/*public*/ interface Swim { }

/*public*/ interface Hop { }