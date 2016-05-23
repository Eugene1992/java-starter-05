package hw.hw05;

/**
 * Created by YANA on 23.05.2016.
 */
public class Car {
    public int year, weigt;
    public double speed;
    public String color;
    public Car(){
        this.year=1990;
        this.weigt=1000;
        this.speed=180.2;
        this.color="wight";
    }
    public Car(int year, double speed){
        this.weigt=2000;
        this.speed=speed;
        this.year=year;
        this.color="black";
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
