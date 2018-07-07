import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.*;

// ZooManager using non-concurrent collection HashMap with syncrhonized

public class ZooManagerMap {
  private Map<String, Object> foodData = new HashMap<String, Object>();
  
  public synchronized void put(String key, String value) {
    foodData.put(key, value);
  }
  
  public synchronized Object get(String key) {
    return foodData.get(key);
  }
  
  public static void main(String[] args) {
    ExecutorService service = null;
    try {
      service = Executors.newFixedThreadPool(20);
      ZooManagerMap zooManager = new ZooManagerMap();
      service.submit(() -> zooManager.put("aaa", "AAA"));
      service.submit(() -> zooManager.put("bbb", "BBB"));
      service.submit(() -> zooManager.put("ccc", "CCC"));
      System.out.println(zooManager.get("aaa"));
      System.out.println(zooManager.get("bbb"));
      System.out.println(zooManager.get("ccc"));
    } finally {
      if (service != null) service.shutdown();
    }
  }
}