package hw.hw03;

/**
 * Created by YANA on 23.05.2016.
 */
public class Rectangle {
    double side1, side2;

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void areaColkulator(){
        double area = side1*side2;
        System.out.println("Area "+area);
    }
    public void perimetrColkulator (){
        double perimetr = (side1+side2)*2;
        System.out.println("Perimetr "+perimetr);
    }
}
