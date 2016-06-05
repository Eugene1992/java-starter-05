package obj_methods;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericPair <K, V>{
    private K k;
    private V v;

    public GenericPair(K k, V v) {
        this.k = k;
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    public List<? super Employee> fiobjllList(K obj){
        List<? extends Employee> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            //list.add(obj);
        }
        return null;
    }

    public static void main(String[] args) {
        GenericPair<String, String> pair = new GenericPair<>("", "");

        List<Employee> employees = new ArrayList<>();
        Collections.sort(employees);
    }
}
