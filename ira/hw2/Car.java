/**
 * Created by notebook on 18.05.2016.
 */
public class Car {
    int year;
    String color;
    public Car(int year, String color){
        this.year = year;
        this.color = color;
    }
    public Car(){
        year = 2012;
        color = "green";
    }
    public Car(String color){
        year = 1982;
        this.color = color;
    }

    public static void main(String[] args) {
        Car car1 = new Car(1996, "white");
        Car car2 = new Car();
        Car car3 = new Car("red");
        System.out.println(car1.year + " " + car1.color);
        System.out.println(car2.year + " " + car2.color);
        System.out.println(car3.year + " " + car3.color);

    }
}
