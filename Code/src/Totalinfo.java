import java.util.HashMap;
import java.util.Map;

public class Totalinfo {
  public static Map<String, String> monsterInfo = new HashMap<>();
  
    public static void setInfo(String name, String boxtext){
      monsterInfo.put(name, boxtext);
    }

}
