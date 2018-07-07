public class Tail {}

/*public*/ class Primate {
}

/*public*/ class Monkey extends Primate {
  protected Tail tail;
}

/*public*/ class Chimpanzee extends Primate {
  // Chimpanzee not has-a Tail
}

/* We removed the Tail property from the Primate class, 
 * since not all primates have tails.
 */