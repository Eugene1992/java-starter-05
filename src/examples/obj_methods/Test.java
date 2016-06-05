package obj_methods;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {

    Pair someWord = new Pair("Dog", "Собака");

    GenericPair<Integer, String> someGenericWord1 = new GenericPair<>(1, "Green");
    GenericPair<String, String> someGenericWord2 = new GenericPair<>("Green", "Зеленый");
    GenericPair<Integer, Integer> someGenericWord3 = new GenericPair<>(13, 2);

        ArrayList<Employee> arrayList = new ArrayList<>();
        arrayList.add(new Employee(1, "Yana", 19));

        System.out.println(((Employee)arrayList.get(1)).getAge());
    }
}
