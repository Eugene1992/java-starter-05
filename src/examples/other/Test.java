package other;

import lesson05.IllegalNameException;

import java.io.*;

public class Test {

    public void printBark(Barkable someBarkableAnimal){
        someBarkableAnimal.bark();
    }

    public static void main(String[] args) throws IllegalNameException {

        /*Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        if (age < 0){
            throw new IllegalNameException("sds");
        }

        System.out.println(age);*/

        long[] longs = new long[Integer.MAX_VALUE];
    }

    static void doSomethingElse() {
        try {
            FileOutputStream fos = new FileOutputStream("B:/myfile.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
