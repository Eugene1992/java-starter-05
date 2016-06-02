package hw.hwBasic8Addition;

import java.util.Scanner;

/**
 * Created by User on 02.06.2016.
 */
//Я специально хотел попробывать с статическими методами.

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator(4, 3);
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите операцию название операции(plus,minus,del,umn):");
       //Как написать что scan считывал арифметические знаки (+ - * /)
        String znak = scan.next();
        switch (znak) {
            case ("plus"):
                System.out.println(cal.add());
                break;
            case ("minus"):
                System.out.println(cal.sub());
                break;
            case ("umn"):
                System.out.println(cal.mul());
                break;
            case ("del"):
                System.out.println(cal.div());
                break;
        }
    }
}


