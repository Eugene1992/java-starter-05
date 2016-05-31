package hw.hwBasic6Hw2;

/**
 * Created by User on 31.05.2016.
 */
//Создать класс Vehicle с методом print. В классе Vehicle, создайте внутренний класс Wheel и Door
//которые также должны содержать метод print. Создайте экземпляры классов Wheel и Door.

public class Vehicke {
    void print() {
        System.out.println("Vehicle");
    }

    public static class Wheel {
        void print() {
            System.out.println("Vehicle Too");
        }
    }

    public static class Door {
        void print() {
            System.out.println("Vehicle Three");
        }
    }

    public static void main(String[] args) {
        Vehicke veh = new Vehicke();
        veh.print();
        Wheel veh2 = new Wheel();
        veh2.print();
        Door veh3 = new Door();
        veh3.print();
    }
}