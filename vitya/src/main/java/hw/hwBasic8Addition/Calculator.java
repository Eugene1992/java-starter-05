package hw.hwBasic8Addition;

/**
 * Created by User on 02.06.2016.
 */
//В теле класса создайте четыре метода для арифметических действий: (add – сложение, sub – вычитание, mul – умножение, div – деление).
//Метод деления должен делать проверку деления на ноль, если проверка не проходит, сгенерировать исключение.
//Пользователь вводит значения, над которыми хочет произвести операцию и выбрать саму операцию. При возникновении ошибок должны выбрасываться исключения.

public class Calculator {
    private static int firstNum;
    private static int secondNum;

    public Calculator(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public static int add() {
        return firstNum + secondNum;
    }

    public static int sub() {
        return firstNum - secondNum;
    }

    public static int mul() {
        return firstNum * secondNum;
    }

    public static int div() {
        try {
            return firstNum / secondNum;
        } catch (Exception e) {
            System.out.println("На ноль не делят");
        }
        return 0;
    //Как сделать что б не выводило ноль после деления на ноль(каламбур)))
    }
}

