package lesson05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListsExample {
    public static void main(String[] args) {

        /*���������� �������*/
        List<String> arrayList = new ArrayList<String>();
        List<String> linkedList = new LinkedList<String>();

        /*�������� ��������*/
        arrayList.add("Ira");
        arrayList.add("Andrey");
        arrayList.add("Max");
        arrayList.add("Yana");
        arrayList.add("Will be deleted soon");

        /*�������� ������� �� �������*/
        arrayList.add(2,"Vitya");

        /*�������� �������� ������ ���������*/
        arrayList.addAll(new ArrayList<String>());

        /*�������� �������� ������ ��������� �� �������*/
        arrayList.addAll(2, new ArrayList<String>());

        /*������� ������� �� ������*/
        arrayList.set(4, "Maxim");

        /*������� ������� �� ��������*/
        arrayList.remove("Will be deleted soon");

        /*������� ������� �� ������*/
        String forDelete = "Will be deleted soon";
        arrayList.remove(forDelete);

        /*�������� ������� �� �������*/
        String firstElement = arrayList.get(0);

        /*��������� ���� �� ������ � ������*/
        boolean isContain = arrayList.contains("Andrey");

        /*�������� ������������ ��������� �� ������*/
        List<String> sublist = arrayList.subList(2, 4);

        /*�������� ������ �������� � ������*/
        int index = arrayList.indexOf("Ira");

        /*�������� ������ ���������� ��������� �������� � ������*/
        int lastIndex = arrayList.lastIndexOf("Ira");

        /*��������� ������ �� ������ ��� ���*/
        boolean isEmptyList = arrayList.isEmpty();

        /*�������� ������ ������*/
        int listSize = arrayList.size();

        /*�������� ������ �� ������. ����� ������ ���������� � ������� ����*/
        String[] array = (String[]) arrayList.toArray();

        /*�������� ��� ��������*/
        arrayList.clear();
    }
}
