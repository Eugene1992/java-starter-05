package hwBasic3Hw3;

/**
 * Created by User on 22.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.Price = 20000;
        car.Speed = 200;
        car.Year = 2010;
        System.out.println("Car Price: " + car.Price);
        System.out.println("Car Speed: " + car.Speed);
        System.out.println("Car Year: " + car.Year);
        System.out.println((char) 27 + "[31m" + "=================================" + (char) 27 + "[0m");

        Plane plane = new Plane();
        plane.Price = 1222220;
        plane.Speed = 500;
        plane.Year = 2000;
        plane.height = 80000;
        plane.number_of_passengers = 150;
        System.out.println("Plan Price: " + plane.Price);
        System.out.println("Plan Speed: " + plane.Speed);
        System.out.println("Plan Year: " + plane.Year);
        System.out.println("Plan Height: " + plane.height);
        System.out.println("Plan passenger: " + plane.number_of_passengers);
        System.out.println((char) 27 + "[31m" + "=================================" + (char) 27 + "[0m");

        Ship ship = new Ship();
        ship.Price = 12;
        ship.Speed = 800;
        ship.Year = 2002;
        ship.port = 8;
        ship.number_of_passengers2 = 2000;
        System.out.println("Ship Price: " + ship.Price);
        System.out.println("Ship Speed: " + ship.Speed);
        System.out.println("Ship Year: " + ship.Year);
        System.out.println("Ship Height: " + ship.port);
        System.out.println("Ship passenger: " + ship.number_of_passengers2);

    }
}
