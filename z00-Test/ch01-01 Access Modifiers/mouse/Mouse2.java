package mouse;

public class Mouse2 extends cat.BigCat { 
  
  public void viewPro() {
    System.out.println(pro);
  }
  
  public static void main(String[] args) {
    Mouse2 mou = new Mouse2();
    System.out.println(mou.pub);
    System. out .println(mou.pro);
    //System. out .println(cat.def); // X
    //System. out .println(cat.pri); // X
    
    mou.viewPro();
  }
}
