package hw.hw04;

/**
 * Created by YANA on 23.05.2016.
 */
public class MyArea {
    private static final double pi=3.14;
    public  double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    static void areaOFCercl(double radius){
        final double  areaCercl = ((radius*radius)*pi);
        System.out.println(" The cercls' area is "+areaCercl);
    }
}
