import java.util.Map;
import java.util.concurrent.*;

// ZooManager using concurrent collection ConcurrentHashMap without syncrhonized
public class ZooManager {
  private Map<String, Object> foodData = new ConcurrentHashMap<String, Object>();
  
  public void put(String key, String value) {
    foodData.put(key, value);
  }
  
  public Object get(String key) {
    return foodData.get(key);
  }
  
  public static void main(String[] args) {
    ExecutorService service = null;
    try {
      service = Executors.newFixedThreadPool(20);
      ZooManager zooManager = new ZooManager();
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