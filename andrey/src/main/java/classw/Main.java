package classw;
import java.util.*;
/* Сравнить и вивести самою большую зарплату и найти суму зарплату*/
public class Main {
    public static void main(String[] args) {
        System.out.println(" Big solary :" + " " + Employee.getRichEmp(Arrays.asList(new Employee("Max", 26, 500),
                new classw.Employee("Vitya", 16, 5000), new Employee("Andrey", 26, 7000), new Employee("Losha", 25, 80000))
        ).getName());
        System.out.println("Sum solary" + " " + Employee.getBigSolar(Arrays.asList(new Employee("Max", 26, 500),
                new classw.Employee("Vitya", 16, 5000), new Employee("Andrey", 26, 7000), new Employee("Losha", 25, 80000))
        ));

    }
}
