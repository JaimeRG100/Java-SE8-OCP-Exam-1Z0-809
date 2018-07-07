import java.util.*;

public class TestInterface {
  private void anyFlyer(List<Flyer> flyer) {}
  private void groupOfFlyers(List<? extends Flyer> flyer) {}
  
  public static void main(String... args) {
    // test code
    TestInterface testInterface = new TestInterface();
    
    testInterface.anyFlyer(new ArrayList<Flyer>());
    //testInterface.anyFlyer(new ArrayList<HangGlider>());    //Error: incompatible types
    //testInterface.anyFlyer(new ArrayList<Goose>());         //Error: incompatible types
    
    testInterface.groupOfFlyers(new ArrayList<Flyer>());
    testInterface.groupOfFlyers(new ArrayList<HangGlider>());
    testInterface.groupOfFlyers(new ArrayList<Goose>());
    
    ArrayList<Flyer> list = new ArrayList<Flyer>();
    list.add(new HangGlider());
    list.add(new Goose());
    testInterface.groupOfFlyers(list);
    list.add(new HangGlider());
    list.add(new Goose());    
  }
}


interface Flyer { void fly(); }

class HangGlider implements Flyer { 
  public void fly() {}   
}

class Goose implements Flyer { 
  public void fly() {}   
}