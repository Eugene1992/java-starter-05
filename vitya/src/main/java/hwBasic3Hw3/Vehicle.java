package hwBasic3Hw3;
//Создать класс Vehicle.
//        В теле класса создайте поля: координаты и параметры средств передвижения (цена, скорость, год выпуска).
//        Создайте 3 производных класса Plane, Саг и Ship.
//        Для класса Plane должна быть определена высота и количество пассажиров.
//        Для класса Ship – количество пассажиров и порт приписки.
//        Написать программу, которая выводит на экран информацию о каждом средстве передвижения.


public class Vehicle {
    public int Price;
    public int Speed;
    public int Year;

    public Vehicle() {

    }

    public int getPrice() {
        return Price;
    }

    public int getSpeed() {
        return Speed;
    }

    public int getYear() {
        return Year;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public void setYear(int year) {
        Year = year;
    }
}
