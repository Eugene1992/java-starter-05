package hw.hwBasic7Hw2;

/**
 * Created by User on 01.06.2016.
 */
//Создайте перечислительный тип (enum) Animals, содержащий конструктор, который должен принимать
//целочисленное значение (возраст животного), и содержать перегруженный метод toString(), который
//должен возвращать название экземпляра и возраст животного.


public enum Animals {
    CAT(12);
    private int age;

    Animals(int age) {
        this.age = age;
    }

    public String toString() {
       return this.name() + " " + age;
    }
    //Не могу понять как вернуть экземпляр и возраст)

    public static void main(String[] args) {
        System.out.println(Animals.CAT);
    }
}
