package hw.hwBasic6Hw3;

/**
 * Created by User on 31.05.2016.
 */
//Создать класс Distance с полем distance типа double и методом print. В классе Distance, создайте
//статический класс Converter с методами, которые будут конвертировать расстояние в разные единицы
//измерения (к примеру, из метров в километры, из километров в мили, и так далее).

public class Distance {
    public static double distance=4;

    public Distance(double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public static void print() {
    }

    static class Converter {
        public void tokil() {
            System.out.println(distance = distance * 10);
        }

        public void toNex() {
            System.out.println(distance = distance * 10);
        }
    }

    public static void main(String[] args) {
        Converter dis2 = new Converter();
        dis2.tokil();
        dis2.toNex();
    }
}


