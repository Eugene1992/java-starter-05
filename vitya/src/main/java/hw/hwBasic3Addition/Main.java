package hw.hwBasic3Addition;

/**
 * Created by User on 21.05.2016.
 */
//Создайте класс Printer.
//        В теле класса создайте метод void print(String value), который выводит на экран значение аргумента.
//        Реализуйте возможность того, чтобы в случае наследования от данного класса других классов, и вызове соответствующего метода их экземпляра, строки, переданные в качестве аргументов методов, выводились разными цветами.
//        Обязательно используйте приведение типов.


public class Main {
    public static void main(String[] args) {
        ExtendClass extendClass = new ExtendClass();
        extendClass.Print();
        System.out.println((char) 27 + "[33m" + extendClass.color + (char) 27 + "[0m");
        System.out.println((char) 27 + "[36m" + extendClass.color + (char) 27 + "[0m");
        System.out.println((char) 27 + "[35m" + extendClass.colorNext + (char) 27 + "[0m");
    }
}
