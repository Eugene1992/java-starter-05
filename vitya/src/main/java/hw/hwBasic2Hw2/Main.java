package hw.hwBasic2Hw2;

/**
 * Created by User on 18.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(1992);
        Car car = new Car(1991, "Red");
        System.out.println(car.getYear() + car.getColor());
    }
}
