package hw.hwBasic2Hw3;

/**
 * Created by User on 18.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Car carDefault = new Car();
        Car carFirst = new Car(20);
        Car carSecod = new Car(2003, 110);
        Car carThirl = new Car(2004, 111, 1);
        Car carFour = new Car(2005, 112, 2, "Yellow");
        System.out.println("carDefault = " + carDefault.getYear() + ", " + carDefault.getSpeed() + ", " + carDefault.getWeight() + ", " + carDefault.getColor());
        System.out.println("carFirst = " + carFirst.getYear() + ", " + carFirst.getSpeed() + ", " + carFirst.getWeight() + ", " + carFirst.getColor());
        System.out.println("carSecod = " + carSecod.getYear() + ", " + carSecod.getSpeed() + ", " + carSecod.getWeight() + ", " + carSecod.getColor());
        System.out.println("carThirl = " + carThirl.getYear() + ", " + carThirl.getSpeed() + ", " + carThirl.getWeight() + ", " + carThirl.getColor());
        System.out.println("carFour = " + carFour.getYear() + ", " + carFour.getSpeed() + ", " + carFour.getWeight() + ", " + carFour.getColor());
    }
}
