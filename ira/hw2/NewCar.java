/**
 * Created by notebook on 18.05.2016.
 */
public class NewCar {
    /*Задание 3
Используя Intelij IDEA создать проект, пакет.
(Заново!) Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
Перегрузить конструкторы.
Создать класс Main, в котором создать экземляры класса Машина с разными параметрами
*/
    int year;
    double speed;
    int weight;
    String color;
    public NewCar(){
        year = 1987;
        speed = 157;
        weight = 654;
        color = "blue";
    }
    public NewCar(int year){
        this.year = year;
        speed = 157;
        weight = 654;
        color = "blue";
    }
    public NewCar(int year, double speed, int weight, String color){
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }
}
