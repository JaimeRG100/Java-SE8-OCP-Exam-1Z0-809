import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;
import java.io.*;

class TestConcurrent {
  

  public static void main(String[] args) {
    Map<String, String> map = new ConcurrentHashMap<>();
    
    Queue<String> queue = new ConcurrentLinkedQueue<>();
    Deque<String> deque = new ConcurrentLinkedDeque<>();
    
    List<String> list = new CopyOnWriteArrayList<>();
    Set<String> set = new CopyOnWriteArraySet<>();
    
    BlockingQueue<String> bQueue = new LinkedBlockingQueue<>();
    BlockingDeque<String> bDeque = new LinkedBlockingDeque<>();
    
    ConcurrentMap<String, String> cMap = new ConcurrentSkipListMap<>();
    SortedSet<String> cSet = new ConcurrentSkipListSet<>();

  }
}