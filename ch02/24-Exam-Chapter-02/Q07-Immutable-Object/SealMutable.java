import java.util.List;
import java.util.ArrayList;

public class SealMutable {
  String name;
  private final List<SealMutable> friends;
  
  public SealMutable(String name, List<SealMutable> friends) {
    this.name = name;
    this.friends = friends;
  }
  
  public String getName() { return name; }
  
  public List<SealMutable> getFriends() { return friends; }
}

// Class Seal after being fixed to be immutable
class SealImmutable {
  private final String name;
  private final List<SealImmutable> friends;
  
  public SealImmutable(String name, List<SealImmutable> friends) {
    this.name = name;
    this.friends = new ArrayList<SealImmutable>(friends);
  }
  
  public String getName() { return name; }
  
  public int getFriendsCount() { return friends.size();  }
  
  public SealImmutable getFriendsIndex(int index) { return friends.get(index);  }
}