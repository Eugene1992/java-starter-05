package hw.hwBasic2Hw2;

//Создать класс Машина с полями год(int), цвет(String).
// Создать конструктор по умолчанию, конструктор с одним и 2-я параметрами.
//   Создать класс Main в котором создать экземпляры вызывая разные конструкторы.

public class Car {
    private int year;
    private String color;

    public Car() {
    }

    public Car(int year) {
        this.year = year;
    }

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear() {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor() {
        this.color = color;
    }

    public void viewCar() {
        System.out.println(year);
        System.out.println(color);
    }
}
