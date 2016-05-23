import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by notebook on 17.05.2016.
 */
public class Hw5 {
    public static void main(String[] args) {
        System.out.println(AddStart());
        System.out.println(AddMiddle());
        System.out.println(AddEnd());
        System.out.println(LinkAddStart());
        System.out.println(LinkAddMiddle());
        System.out.println(LinkAddEnd());
    }
    public static long AddStart(){
        ArrayList<Integer> arrayList = new ArrayList<Integer>(1000);
        for(int i = 0; i < 500; i++){
            arrayList.add(i);
        }
        long timer = -System.currentTimeMillis();
        for (int i = 0,a = 0; i < 200; i++, a++){
            arrayList.add(i, a);
        }
        timer += System.currentTimeMillis();
        return timer;
    }
    public static long AddMiddle(){
        ArrayList<Integer> arrayList = new ArrayList<Integer>(1000);
        for(int i = 0; i < 500; i++){
            arrayList.add(i);
        }
        long timer = -System.currentTimeMillis();
        for (int i = 200,a = 0; i < 500; i++, a++){
            arrayList.add(i, a);
        }
        timer += System.currentTimeMillis();
        return timer;
    }
    public static long AddEnd(){
        ArrayList<Integer> arrayList = new ArrayList<Integer>(1000);
        for(int i = 0; i < 500; i++){
            arrayList.add(i);
        }
        long timer = -System.currentTimeMillis();
        for (int i = 500,a = 0; i < 800; i++, a++){
            arrayList.add(i, a);
        }
        timer += System.currentTimeMillis();
        return timer;
    }
    public static long LinkAddStart(){
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for(int i = 0; i < 500; i++){
            linkedList.add(i);
        }
        long timer = -System.currentTimeMillis();
        for (int i = 0,a = 0; i < 200; i++, a++){
            linkedList.add(i, a);
        }
        timer += System.currentTimeMillis();
        return timer;
    }
    public static long LinkAddMiddle(){
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for(int i = 0; i < 500; i++){
            linkedList.add(i);
        }
        long timer = -System.currentTimeMillis();
        for (int i = 200,a = 0; i < 500; i++, a++){
            linkedList.add(i, a);
        }
        timer += System.currentTimeMillis();
        return timer;
    }
    public static long LinkAddEnd(){
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for(int i = 0; i < 500; i++){
            linkedList.add(i);
        }
        long timer = -System.currentTimeMillis();
        for (int i = 500,a = 0; i < 800; i++, a++){
            linkedList.add(i, a);
        }
        timer += System.currentTimeMillis();
        return timer;
    }



   /** public static long AddStart(){
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");
        arrayList.add("Four");
        arrayList.add("Five");
        long timer = -System.currentTimeMillis();
        arrayList.add(0, "NewOne");
        arrayList.add(1, "NewTwo");
        timer += System.currentTimeMillis();
        return timer;
    }
    */
}

