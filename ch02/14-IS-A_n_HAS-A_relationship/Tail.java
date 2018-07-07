public class Tail {}

/*public*/ class Primate {
  protected Tail tail;
}

/*public*/ class Monkey extends Primate {
  // Monkey has-a Tail since it is-a Primate
}

/*public*/ class Chimpanzee extends Primate {
  // Chimpanzee has-a Tail since it is-a Primate
}

/* We should remove the Tail property from the Primate class, 
 * since not all primates have tails.
 */