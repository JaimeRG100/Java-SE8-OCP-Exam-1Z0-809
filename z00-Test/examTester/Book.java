public class Book {
  public static class BookFilter {         
    public boolean isFiction(Book b){
      return true;
    } 
  }
  
  public static void main(String[] args) {
    //System.out.println(Book.BookFilter.isFiction(new Book()));
    System.out.println(new Book.BookFilter().isFiction(new Book()));
  }
}