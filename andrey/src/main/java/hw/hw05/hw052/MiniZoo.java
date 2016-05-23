package hw.hw05.hw052;

import java.util.*;

/*Используя Intelij IDEA создать проект, пакет.
Используя класс Zoo Задания 2, удалить 3, 5, 7 животные, узнать размер списка и вывести в консоль.
*/
public class MiniZoo {
    public static void main(String[] args) {
        ArrayList anim = new ArrayList();
        anim.add("mouse");
        anim.add("zebra");
        anim.add("elephant");
        anim.add("byzon");
        anim.add("lione");
        anim.add("snake");
        anim.add("panther");
        anim.add("dingo dog");
        anim.add("tiger");
        anim.add("spider");
        System.out.println("befor\n" + anim);

        anim.remove(3);
        anim.remove(5);
        anim.remove(7);
        System.out.println("after\n" + anim);

    }
}
