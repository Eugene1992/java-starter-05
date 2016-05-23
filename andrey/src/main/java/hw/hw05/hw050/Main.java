package hw.hw05.hw050;
import java.util.*;
/*Создать class Main, в нем создать список, добавить учителей, которых вы только сможете вспомнить со школы.
И получить индекс самого лучшего учителя и самого не очень. Вывести список в консоль.*/
public class Main {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
         arrayList.add("Petrova");
        arrayList.add("Ivanova");
        arrayList.add("Sidorov");
        arrayList.add("Petruk");
        arrayList.add("Poznyak");
        arrayList.add("Garbuza");
        arrayList.add("Gerashimenko");
        System.out.println("God teacher-"+ arrayList.get(3));
        System.out.println("Beg teacher-"+arrayList.get(5));
    }
}
