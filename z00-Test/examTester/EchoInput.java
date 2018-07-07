public class EchoInput {
  public static void main(String [] args) {
    if(args.length <= 3) assert false;
    System.out.println(args[0]);
  }
}