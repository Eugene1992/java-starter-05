package hw.hw05.hw053;
import java.util.*;
/*
Создать класс Main, создать список целых чисел и используя ListIterator пройтись по списку и увеличить значения на 1;
*/
public class Mian {
    public static void main(String[] args) {
        ArrayList <Integer> list= new ArrayList<Integer>(10);
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(1);
        ListIterator<Integer>  a= list.listIterator() ;
         while(a.hasNext()){
         list.set(a.nextIndex(),a.nextIndex()+1);
             System.out.println(a.nextIndex());
         }
        //System.out.println(a.nextIndex());
    }

}
