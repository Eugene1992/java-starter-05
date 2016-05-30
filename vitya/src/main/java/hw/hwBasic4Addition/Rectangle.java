package hw.hwBasic4Addition;

/**
 * Created by User on 30.05.2016.
 */
public class Rectangle extends AbstractRectangle {

    public Rectangle(double side1, double side2) {
        super(side1, side2);
    }

    @Override
    double area() {
        return side1 * side2;
    }

    @Override
    double perimetr() {
        return side1 + side2;
    }

    public void viewRectangle() {
        System.out.println("Площадь прямоугольника = " + area());
        System.out.println("Периметер прямоугольника = " + perimetr());
    }
}
