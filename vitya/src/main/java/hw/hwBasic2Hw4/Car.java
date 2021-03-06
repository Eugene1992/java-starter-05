package hw.hwBasic2Hw4;

/**
 * Created by User on 18.05.2016.
 */
//Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
//   Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
//  Перегрузить конструкторы вызывая конструктор из конструктора.
// Создать класс Main, в котором создать экземляры класса Машина с разными параметрами.

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car() {
    }

    public Car(int year) {
        this(13, 60);
    }

    public Car(int year, double speed) {
        this.year = 25;
        this.speed = speed;
    }

    public Car(int year, double speed, int weight) {
        this.weight = weight;
        this.year = year;
        this.speed = speed;
    }

    public Car(int year, double speed, int weight, String color) {
        this.color = color;
        this.year = year;
        this.speed = speed;
        this.weight = weight;
    }

    public int getYear() {
        return year;
    }

    public double getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
