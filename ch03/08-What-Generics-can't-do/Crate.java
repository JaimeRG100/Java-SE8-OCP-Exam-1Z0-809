public class Crate<T> {
  private T content;
  
  public Crate(T content) {
    this.content = content;
  }
  
  public T emptyCrate() {
    return content;
  }
  
  public T CallConstructor() {
    // return new T();               // Can't Call the constructor
    return null;
  }
  
  public void CreateArray() {
    //T[] contents = new T[1];       // Can't Create an array of static type
  }  
  
  public void InstancOf(T d) {
    //boolean r = d instanceof T;   // Can't Call instanceof
  }
  
  //static void StaticMethod(T i) {} // Can't Crate static variable a a generic type parameter
}

//class GenericX<int> {}             // Can't Yse a primitive type


class Elephant {}