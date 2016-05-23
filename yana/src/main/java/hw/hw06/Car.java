package hw.hw06;

/**
 * Created by YANA on 23.05.2016.
 */
public class Car {
    public int year, weight;
    public double speed;
    public String color;
    public Car(){
        this.year=1995;
        this.weight=4000;
        this.speed=185.5;
        this.color="Yellow";
    }
    public Car(int year){
        this.year=year;
        this.weight=1500;
        this.speed=70.0;
        this.color="Green";
    }
    public Car(int weight, String color){
        this.year=2009;
        this.weight=weight;
        this.speed=160.7;
        this.color=color;
    }
    public  Car(int year, double speed, String color){
        this.year=year;
        this.weight=3500;
        this.speed=speed;
        this.color=color;

    }
    public  Car(int year,int weight, double speed, String color){
        this.year=year;
        this.weight=weight;
        this.speed=speed;
        this.color=color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
