public class Product implements java.lang.Comparable<Product> {
  int id;
  String name;
  
  public boolean equals(Object obj) {
    if(!(obj instanceof Product)) {
      return false;
    }
    Product other = (Product) obj;
    return this.id == other.id;
  }
  
  public int compareTo(Product obj) {
    return this.name.compareTo(obj.name);
  }
  
  /*
   * compareTo() method is not consistent with equals().
   * One way to fix this is to use a Comparator to define
   * the sort elsewhere
   * 
   */
}