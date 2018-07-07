import java.sql.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
import java.time.*;
import java.nio.file.*;
import java.io.*;

public class TestClassX {
  public static void main(String[] args) throws Exception{     
    List<Book> books = Arrays.asList(new Book("Thinking in Java", 30.0),                                  new Book("Java in 24 hrs", 20.0),                                  new Book("Java Recipies", 10.0)); 
    double averagePrice = books.stream().filter(b->b.getPrice()>10)         .mapToDouble(b->b.getPrice())         .average().getAsDouble(); System.out.println(averagePrice); 
  }

}
class Book{     private String title;     private double price;     public Book(String title, double price){         this.title = title;         this.price = price;     }
  Double getPrice() { return price; }
  //getters/setters not shown 
  
}