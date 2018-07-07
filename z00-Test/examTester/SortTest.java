import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
import java.nio.file.*;
import java.io.*;

public class SortTest {
  public static int diff(Person p1, Person p2){
    return p1.dob.compareTo(p2.dob);
  }
  
  
  public static void main(String[] args) {
    ArrayList<Person> al = new ArrayList<>();
    al.add(new Person("Paul", "01012000"));
    al.add(new Person("Peter", "01011990"));
    al.add(new Person("Patrick", "01012002"));
    
    System.out.println(al);
    java.util.Collections.sort(al, (p1, p2)->p1.dob.compareTo(p2.dob));
    System.out.println(al);
    java.util.Collections.sort(al, SortTest::diff);
    System.out.println(al);
    java.util.Collections.sort(al, new MySorter()::compare);
    System.out.println(al);
    java.util.Collections.sort(al, (a,b) -> new AnyClass().compare(a,b));
    System.out.println(al);
  }
}

class AnyClass {
  public int compare(Object o1, Object o2) {
    Person p1 = (Person) o1;
    Person p2 = (Person) o2;
    return p1.name.compareTo(p2.name);
  }
}
/*
    I java.util.Collections.sort(al, (p1, p2)->p1.dob.compareTo(p2.dob));
    
  II java.util.Collections.sort(al, SortTest::diff);
    
  III   java.util.Collections.sort(al, new MySorter()::compare);
  
  IV java.util.Arrays.sort(al, SortTest::diff);
  */

class Person{
  String name;
  String dob;
  public Person(String name, String dob){
    this.name = name; this.dob = dob;
  }
  public String toString() { return name + ", " + dob; }
}
class MySorter {
  public int compare(Person p1, Person p2){
    return p1.dob.compareTo(p2.dob);
  }
}