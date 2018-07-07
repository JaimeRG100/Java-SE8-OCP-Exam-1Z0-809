public class RunSampleApps {
  public static void main(String args[]) {
    //float value = 102.0;
    float value1 = 102;
    float value2 = (int)102.0;
    //float value3 = 1f * 0.0;
    float value4 = 1f * (short)0.0;
    //float value5 = 1f * (boolean)0.0;
    
    
    int x = 0;
    int y = 10;
    while (x < y) {
      System.out.print("<><>");
      for (int i=2; i<5; i++, x++) {
        x++;
        System.out.print("-");
      }
    }
    System.out.println();
    System.out.println(x + "," + y);
    
    
    String mammal = "DOLPHIN";
    String modified = mammal.substring(2, mammal.indexOf("I"));
    modified += "x" + mammal.substring(4);
    System.out.println(modified);
    
    
    x = 0;
    while (++x < 5) { x+=1; }
    String message = x > 5 ? "Greater than": "less than";
    System.out.println(message + "," + x);
  }
}

abstract class Test {
  public abstract void swim();
  public void swim2(){}
}


// try page 588
// i guess the output will be
// <><>----<><>----
// 12 , 10