public class Tail {}

class Animal {
  public String name;
}

class Canine extends Animal {
  public Tail tail;
}

class Wolf extends Canine {}

/*
A. Wolf has-a name.
B. Wolf has-a Tail.
D. Wolf is-a Animal.
*/