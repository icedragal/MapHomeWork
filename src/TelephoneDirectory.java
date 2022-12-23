import java.util.HashMap;
import java.util.Map;

public class TelephoneDirectory {
    private final Map<String, String> directory = new HashMap<>();
    public void add(String name, String phone){
        directory.put(name, phone);
    }
    public void print(){
        for (Map.Entry<String, String> entry: directory.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
