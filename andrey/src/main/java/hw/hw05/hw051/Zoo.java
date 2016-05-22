package hw.hw05.hw051;
import java.util.*;
/*Создать класс Zoo. В классе создать список, в который записать 8 животных через метод add(index, element).
Вывести список в консоль.
*/
public class Zoo {
    public static void main(String[] args) {
        ArrayList animal = new ArrayList();
        int n=5;
        for (int i = 0; i <n ; i++) {
            animal.add(i,"zebra");
        }
        for (Object a: animal) {
            System.out.println(a);
        }

    }
}
