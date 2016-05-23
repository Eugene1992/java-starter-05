/**
 * Created by notebook on 18.05.2016.
 */
public class Rectangle {
    double side1, side2;

    public double areaCalculator (double side1, double side2){
        return side1 * side2;
    }
    public double perimeterCalculator (double side1, double side2){
        return 2*(side1 + side2);
    }

    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        System.out.println("Площадь = " + rec.areaCalculator(58.6, 58.4));
        System.out.println("Периметр = " + rec.perimeterCalculator(394.25, 24.6));
    }
}
