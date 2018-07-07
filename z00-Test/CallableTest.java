import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutionException;


class CallableTest {
  public static void main(String []args){
    long N = 20;

    Callable<Long> task = new Factorial(N);

    ExecutorService es = Executors.newSingleThreadExecutor();

    Future<Long> future = es.submit(task);

    try {
      System.out.printf("factorial of %d is %d", N, future.get());
    } catch (InterruptedException | ExecutionException e ) { }
    es.shutdown();
  }
}

class Factorial implements Callable<Long> {
  long n;
  public Factorial(long n) {
    this.n = n;
  }
  
  public Long call() throws java.io.IOException {
    if(n <= 0) {
      throw new java.io.IOException("for finding factorial, N should be > 0");
    }
    long fact = 1;
    for(long longVal = 1; longVal <= n; longVal++) {
      fact *= longVal;
    }
    return fact;
  }
}
