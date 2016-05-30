package hw.hwBasic5Hw3;

import java.util.ArrayList;

/**
 * Created by User on 30.05.2016.
 */

//Используя Intelij IDEA создать проект, пакет.
//        Используя класс Zoo Задания 2, удалить 3, 5, 7 животные, узнать размер списка и вывести в консоль.

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

        zoo.remove(2);
        zoo.remove("Howl");
        zoo.remove(4);

        System.out.println(zoo.size());
        System.out.println(zoo);
    }
}
