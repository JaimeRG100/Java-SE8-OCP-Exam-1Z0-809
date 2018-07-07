import java.util.*;

public class TuttiFrutti {
  
  public static void main(String[] args) {
    List<String> list = new ArrayList<String>();
    System.out.println(list.add("abc"));
    System.out.println(list.add("def"));
    System.out.println(list);
    list.add(0, "ghi");
    System.out.println(list);
    System.out.println(list.contains(new String("ghi")));
    list.clear();
    String[] str = {"a","b","d"};
    list = Arrays.asList(str);
    str = (String[]) list.toArray();
    str[0] = "hahaha";
    System.out.println(list);
    for(String s: str)
      System.out.println(s);
    Arrays.sort(str);
    System.out.println(Arrays.binarySearch(str,"hahaha"));
    
    Collections.sort(list);
    System.out.println(Collections.binarySearch(list, "a"));
    String a = "123";
    
    Box<String> box = new Box<>();
    Box<String> box3 = box.<String>ship();
    
    List<String> list1 = new LinkedList<>();
    Queue<String> list2 = new LinkedList<>();
    
    list2.add("one");
    list2.add("two");
    list2.add("three");
    list2.add("four");
    list2.offer("five");
    //list2.push("zero");
    System.out.println(list2);
    
    
    Queue<String> queue = new ArrayDeque<>();
    queue.offer("one");
    queue.offer("two");
    queue.offer("three");
    System.out.println(queue.poll());
    System.out.println(queue);
    
    ArrayDeque<String> stack = new ArrayDeque<>();
    stack.push("one");
    stack.push("two");
    stack.push("three");
    stack.offer("zero");
    System.out.println(stack.pop());
    System.out.println(stack);
  }
  
  
  

}


class Box <T> {
  private T content;
  void pack(T t) { content = t; }
  
  public T get() { return content; }
  public Box<T> ship() {
      return new Box<T>();  } }



