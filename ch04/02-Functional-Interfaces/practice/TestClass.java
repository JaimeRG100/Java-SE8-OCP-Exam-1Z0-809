@FunctionalInterface
interface Supplier<T> {
  public T get();
}

@FunctionalInterface
interface Consumer<T> {
  public void accept(T t);
}

@FunctionalInterface
interface BiConsumer<T, U> {
  public void accept(T t, U u);
}

@FunctionalInterface
interface Predicate<T> {
  public boolean test(T T);
}

@FunctionalInterface
interface BiPredicate<T, U> {
  public boolean test(T t, U u );
}

@FunctionalInterface
interface Function<T, R> {
  public R apply(T t);
}

@FunctionalInterface
interface BiFunction<T, U, R> {
  public R apply(T t, U u);
}

@FunctionalInterface
interface UnaryOperator<T> {
  public T apply(T t);
}

@FunctionalInterface
interface BinaryOperator<T>{
  public T apply(T t1, T t2);
}