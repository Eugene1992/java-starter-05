package obj_methods;

import java.util.ArrayList;
import java.util.List;

public class Pair {
    private String key;
    private String value;

    public Pair(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public <K> List<K>  fiobjllList(K obj){
        List<K> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(obj);
        }
        return list;
    }
}
