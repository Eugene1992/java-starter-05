package hw.hwBasic5Hw2;

import java.util.ArrayList;

/**
 * Created by User on 30.05.2016.
 */
//Создать класс Zoo. В классе создать список, в который записать 8 животных через метод add(index, element).
//        Вывести список в консоль.

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> zoo = new ArrayList<>();
        zoo.add(0, "Lion");
        zoo.add(1, "Fox");
        zoo.add(2, "Pantera");
        zoo.add(3, "Bat");
        zoo.add(4, "Spider");
        zoo.add(5, "Bug");
        zoo.add(6, "Howl");

        System.out.println(zoo);
    }
}
