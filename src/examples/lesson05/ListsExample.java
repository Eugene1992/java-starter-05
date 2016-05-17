package lesson05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListsExample {
    public static void main(String[] args) {

        /*Обьявление списков*/
        List<String> arrayList = new ArrayList<String>();
        List<String> linkedList = new LinkedList<String>();

        /*Добавить элементы*/
        arrayList.add("Ira");
        arrayList.add("Andrey");
        arrayList.add("Max");
        arrayList.add("Yana");
        arrayList.add("Will be deleted soon");

        /*Добавить элемент по индексу*/
        arrayList.add(2,"Vitya");

        /*Добавить элементы другой коллекции*/
        arrayList.addAll(new ArrayList<String>());

        /*Добавить элементы другой коллекции по индексу*/
        arrayList.addAll(2, new ArrayList<String>());

        /*Именить элемент по индеку*/
        arrayList.set(4, "Maxim");

        /*Удалить элемент по значению*/
        arrayList.remove("Will be deleted soon");

        /*Удалить элемент по обькту*/
        String forDelete = "Will be deleted soon";
        arrayList.remove(forDelete);

        /*Получить элемент по индексу*/
        String firstElement = arrayList.get(0);

        /*Проверить есть ли обьект в списке*/
        boolean isContain = arrayList.contains("Andrey");

        /*Получить подмножество элементов из списка*/
        List<String> sublist = arrayList.subList(2, 4);

        /*Получить индекс элемента в списке*/
        int index = arrayList.indexOf("Ira");

        /*Получить индекс последнего вхождения элемента в списке*/
        int lastIndex = arrayList.lastIndexOf("Ira");

        /*Проверить пустой ли список или нет*/
        boolean isEmptyList = arrayList.isEmpty();

        /*Получить размер списка*/
        int listSize = arrayList.size();

        /*Получить массив из списка. Нужно делать приведение к нужному типу*/
        String[] array = (String[]) arrayList.toArray();

        /*Очистить все элементы*/
        arrayList.clear();
    }
}
