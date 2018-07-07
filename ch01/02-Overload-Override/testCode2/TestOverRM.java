public class TestOverRM {
  public static void main(String[] args) {
    System.out.println(MathClass.sumFive(8));
    System.out.println(MathClassV2.sumFive(9));
        
  }
}


class MathClass {
  public static int sumFive(int x){
    return x + 5;
  }
}

class MathClassV2 extends MathClass{
  public static int sumFive(int x){
    return x * 5;
  }  
}