abstract class Cat {
  static final String name = "The Cat";
  void clean() { }
  
  final abstract void clean2();
}


class Lion extends Cat {
  void clean() { }
}