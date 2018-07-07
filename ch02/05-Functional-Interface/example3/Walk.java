//@FunctionalInterface
public interface Walk {}                     // Not valid functional interface

//@FunctionalInterface
/*public*/ interface Dance extends Sprint {  // Not valid functional interface
  public void dance(Animal animal);
}

//@FunctionalInterface
/*public*/ interface Crawl {                 // Not valid functional interface 
  public void crawl();
  public int getCount();
}




// previous code: 

@FunctionalInterface
/*public*/ interface Sprint {
  public void sprint(Animal animal);            // valid functional interface
}

/*public*/ class Animal {} 
