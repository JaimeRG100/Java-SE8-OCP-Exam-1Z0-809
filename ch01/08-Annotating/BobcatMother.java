class Bobcat {
  public void findDen() {}
}

class BobcatMother extends Bobcat {
  @Override
  public void findDen() {}
  
  /*
  @Override
  public void findDen(boolean b) {}   // DOES NOT COMPILE
  */
}