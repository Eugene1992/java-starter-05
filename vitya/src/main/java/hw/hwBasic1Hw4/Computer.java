package hw.hwBasic1Hw4;

//Создать класс Computer, создать массив объектов Computers размером 5.
//Далее руками создать 5 экземпляров этого класса и записать в компьютер (используя loop).

public class Computer {
    public static void main(String[] args) {
        int[] computers = new int[5];
        for (int i = 0; i < computers.length; i++) {
            Computer computer = new Computer();
        }
    }
}