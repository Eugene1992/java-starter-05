package hw.hwBasic5Addition;

import java.util.ArrayList;

/**
 * Created by User on 30.05.2016.
 */
//Создать class Main, в нем создать список, добавить учителей, которых вы только сможете вспомнить со
//        школы. И получить индекс самого лучшего учителя и самого не очень. Вывести список в консоль

public class Main {
    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<>();
        teachers.add("Lesya Ukrainka");
        teachers.add("Lena Anatolevna");
        teachers.add("Sveta Viktorovna");

        System.out.println("My favorite teacher is " + teachers.get(0));
        System.out.println("Bad teacher is " + teachers.get(2));
    }
}
