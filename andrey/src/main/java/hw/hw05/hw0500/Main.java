package hw.hw05.hw0500;
/*
подсчитать и сравнить время потраченное на добавление n-ого количества обьектов в ArrayList и LinkedList
Замеры провести для добавления в начало, середину и конец списков.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TestDelayList();
        TestDelayLinked();
    }

    static void TestDelayList() {
        final int max = 10000;
        long start = System.currentTimeMillis();
//Час затримок   ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>(max);
        for (int i = 0; i < max; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis() - start;
        System.out.println("Затримка операцій добавляння нового елеента  ArrayList :");
        System.out.println("Добавляємо елемент в початку :" + " " + end + " " + "millis second");
//Добавляємов середину списка
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < max; i++) {
            list.add(list.size() / 2, i);
        }
        long end1 = System.currentTimeMillis() - start1;
        System.out.println(" Добавляємо елемент в середині :" + " " + end1 + " " + "milli second");
//В кінець списка
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < max; i++) {
            list.add(list.size(), i);
        }
        long end2 = System.currentTimeMillis() - start2;

        System.out.println(" Добавляємо елемент в кінці :" + " " + end2 + " " + "millis second\n");

    }

    static void TestDelayLinked() {
        final int max = 10000;
        long st = System.currentTimeMillis();
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        for (int i = 0; i < max; i++) {
            list1.add(i);
        }
        long end = System.currentTimeMillis() - st;
        System.out.println("Затримка операцій добавляння нового елеента  LinkedList :");
        System.out.println("Добавляємо елемент в початок :" + " " + end + " " + "millis second");
        long st1 = System.currentTimeMillis();
        for (int i = 0; i < max; i++) {
            list1.add(list1.size() / 2, i);
        }
        end = System.currentTimeMillis() - st1;
        System.out.println("Добавляємо елемент в середину :" + " " + end + " " + "millis second");
        long st2 = System.currentTimeMillis();
        for (int i = 0; i < max; i++) {
            list1.add(list1.size(), i);
        }
        end = System.currentTimeMillis() - st2;
        System.out.println("Добавляємо елемент в  кінці :" + " " + end + " " + "millis second");

    }

}
