public class LambaExp {
  
  public static void main(String[] args) {
    functional_1 f1 = () -> "";
    //functional_2 f2 = x, y -> x + y;            // should be as the next line
    functional_2 f2 = (x, y) -> x + y;
    //functional_3 f3 = (Coyote y) -> return 0;   // should be as the next line
    functional_3 f3 = (Coyote y) -> {return 0;};
    functional_4 f4 = (Camel c) -> {return;};
    //functional_5 f5 = Wolf w -> 39;             // should be as the next line
    functional_5 f5 = (Wolf w) -> 39;
    //functional_6 f6 = () -> ;                   // should be as the next line
    functional_6 f6 = () -> {return;};
    int a = 10;
    functional_7 f7 = (Animal z, Animal m) -> a; 
  }  
}

interface functional_1 {
  String test();
}

interface functional_2 {
  int test(int x,  int y);
}

class Coyote{}

interface functional_3 {
  int test(Coyote c);
}

class Camel {}

interface functional_4 {
  void test(Camel c);
}

class Wolf {}

interface functional_5 {
  int test(Wolf w);
}

interface functional_6 {
  void test();
}

class Animal {}

interface functional_7 {
  int test(Animal a, Animal b);
}