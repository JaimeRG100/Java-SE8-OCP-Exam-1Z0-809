public class Bird implements Fly {
  
  String name = "none";
  
  public String toLand() {
    return new String("Starting to land");
  }
  
  public static void main(String[] args) {    
    Fly fly1 = new Bird();
    System.out.println(fly1.toLand());
    System.out.println(fly1.height + ":" + Fly.height);
    Fly.takeOff();
    System.out.println(fly1.fly());
  }
}