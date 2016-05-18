package hw.hwBasic2Hw3;

//Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
//  Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
//  Перегрузить конструкторы.
//  Создать класс Main, в котором создать экземляры класса Машина с разными параметрами.

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car() {
    }

    public Car(int year) {
        this.year = year;
        this.speed=150;
    }

    public Car(int year, double speed) {
        this.year = year;
        this.speed = speed;
        this.weight=130;
    }

    public Car(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color="Green";
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
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
