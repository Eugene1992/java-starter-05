package hw.hw06;

public class Solution {
    public static void main(String[] args) {
        Car car=new Car();
        Car car1=new Car(2016);
        Car car2=new Car(1700, "Pink");
        Car car3=new Car (2013, 200.0, "Red");
        Car car4=new Car(1999, 2800, 35.9, "Gray");
        System.out.println("Year "+car.year+" Weight "+car.weight+" Speed "+car.speed+" Color "+car.color);
        System.out.println("Year "+car1.getYear()+" Weight "+car1.weight+" Speed "+car1.speed+" Color "+car1.color);
        System.out.println("Year "+car2.year+" Weight "+car2.getWeight()+" Speed "+car2.speed+" Color "+car.getColor());
        System.out.println("Year "+car3.getYear()+" Weight "+car3.weight+" Speed "+car3.getSpeed()+" Color "+car3.getColor());
        System.out.println("Year "+car4.getYear()+" Weight "+car4.getWeight()+" Speed "+car4.getSpeed()+" Color "+car4.getColor());
    }
    }
