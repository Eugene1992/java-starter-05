package hw.hwBasic6Addition;

/**
 * Created by User on 30.05.2016.
 */

//Создать класс Calculator, с методами для выполнения основных арифметических операций.
//        Написать программу, которая выводит на экран основные арифметические операции.


public class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static int plus(int a, int b) {
        System.out.println("Plus");
        return a + b;
    }

    public static int minus(int a, int b) {
        System.out.println("Minus");
        return a - b;
    }

    public static int dele(int a, int b) {
        System.out.println("Delenie");
        return a / b;
    }

    public static int mno(int a, int b) {
        System.out.println("Ymnozenie");
        return a * b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
