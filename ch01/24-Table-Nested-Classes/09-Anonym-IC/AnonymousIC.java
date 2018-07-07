class AnonymousIC {
  int member = 10;
  
  public int methodX(int a, int b){
    int local = 15;
    return new AbsCls() {                                       // NOT access modifier, abstract, extends,final, static methods
      int sum(int h, int i) {
        System.out.println("member: " + member);                // instance member
        System.out.println("local: " + local);                  // local variable
        return h + i;
      }
    }.sum(a,b);
  }
  
  public static void main(String[] args) {
    System.out.println(new AnonymousIC().methodX(12,8));
    
  }
  
}

abstract class AbsCls {
  abstract int sum(int x, int y);
}

/*
[o] instance member
[o] local var (final)

[X] access modifier
[X] abstract
[X] final
[X] extends
[X] static methods
*/