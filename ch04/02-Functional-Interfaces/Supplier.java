@FunctionalInterface
/*public*/ interface Supplier<T> {
  public T get();
}

@FunctionalInterface
/*public*/ interface Consumer<T> {
  public void accept(T t);
}

@FunctionalInterface
/*public*/ interface BiConsumer<T, U> {
  public void accept(T t, U u);
}

@FunctionalInterface
/*public*/ interface Predicate<T> {
  public boolean test(T t);
}

@FunctionalInterface
/*public*/ interface BiPredicate<T, U> {
  public boolean test(T t, U u);
}

@FunctionalInterface
/*public*/ interface Function<T, R> {
  public R apply(T t);
}

@FunctionalInterface
/*public*/ interface BiFunction<T, U, R> {
  public R apply(T t, U u);
}

@FunctionalInterface 
/*public*/ interface UnaryOperator<T> {
  public T apply(T t);
}

@FunctionalInterface 
/*public*/ interface BinaryOperator<T> {
  public T apply(T t1, T t2);
}