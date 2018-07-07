public class TestBook {
  // test code
  public static void main(String[] args) {
    Book b1 = new Book();
    b1.setISBN(1245);
    Book b2 = new Book();
    b2.setISBN(1245);
    System.out.println(b1.equals(b2));
    //System.out.println(b2.ISBN);
    System.out.println(b2.hashCode());
  }
}

class Book {
  private int ISBN;
  private String title, author;
  private int pageCount;
  public int hashCode() {
    return ISBN;
  }
  @Override public boolean equals(Object obj) {
    if (!(obj instanceof Book)) {
      return false;
    }
    Book other = (Book)obj;     
    return this.ISBN == other.ISBN;                    // NOTE: even the object (b2) was created outside it has access 
  }                                                    // to private ISBN var. since its accessed internally by the owner class
  // imagine getters and setters are here
  public void setISBN(int ISBN)  { this.ISBN = ISBN; }
  public int getISBN() { return this.ISBN; }

}