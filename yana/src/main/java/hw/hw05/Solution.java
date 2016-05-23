package hw.hw05;

public class Solution {
    public static void main(String[] args) {
        Car car=new Car();
        Car carParam=new Car(2018, 200.0);
        System.out.println("Year "+car.year+" Weigt "+car.weigt+" Speed "+car.speed+" Color "+car.color);
        System.out.println("Year "+carParam.getYear()+" Weigt "+carParam.weigt+" Speed "+carParam.speed+" Color "+carParam.color);
    }
}
