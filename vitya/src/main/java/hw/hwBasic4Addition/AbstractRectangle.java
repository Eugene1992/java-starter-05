package hw.hwBasic4Addition;

/**
 * Created by User on 30.05.2016.
 */
//Изменить пример первого урока (работа с документом) и создать общий абстрактный класс для всех частей документа.

public abstract class AbstractRectangle {
    double side1;
    double side2;

    public AbstractRectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    abstract double area();

    abstract double perimetr();
}
