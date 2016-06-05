package other;

import compares.Square;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Parent {
    public static void main(String[] args){
        /*try {
            System.out.println(12 / 0);
        } catch (ArithmeticException e) {
            System.err.println("Divide by zero");
        }*/

        throwExp1();

    }

    public static void throwExp1() {
        try {
            throwExp2();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void throwExp2() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("B:/myfile.txt");
    }
}
