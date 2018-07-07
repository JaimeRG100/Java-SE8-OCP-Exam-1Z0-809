import java.io.*; 
import java.util.*; 
import java.util.stream.*; 
import java.util.function.*; 
public class TestClassXXX
{
  public static void main(String[] args)throws Exception { 
    BinaryOperator<String> bo = (s1, s2) -> s1.concat(s2);
    List<String> names  = new ArrayList<>();
    names.add("Bill"); 
    names.add("George"); names.add("Obama");
    String finalvalue = names.parallelStream().reduce("Hello : ", bo); 
    System.out.println(finalvalue);
  }
}