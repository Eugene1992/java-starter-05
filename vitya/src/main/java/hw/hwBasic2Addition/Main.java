package hw.hwBasic2Addition;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyArea myarea = new MyArea();
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите радиус: ");
        double a = scan.nextDouble();
        myarea.radius = a;
        myarea.viewRaduis();
    }
}
