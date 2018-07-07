public class Bobcat {
  public void findDen() {}
}


class BobcatKitten extends Bobcat {
  public void findDen() {}                           // Overriding
  public void findDen(boolean b) {}                  // Overloading
  public void findden() throws Exception { return; } // Unrelated method
}

