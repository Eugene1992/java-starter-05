package classw;
/* Є лист з даними . потрібно найти нацбільшу запрлату.натйти суму всіх запрлат.третій метод є два числа які задаємо в
в консолі - потрібно age  сравнить з цыми двума параметрами якщо ак , то треба вивести що дана особа попадаэ в цей список*/
import java.util.Collections;
import java.util.*;
public class Employee {
    private String name;
    private int age;
    private int solary;
    private int empCount = 0;
    int a=20;
    int b=30;

    public Employee(String name, int age,int solary) {
        this.name=name;
        this.age=age;
        this.solary=solary;
    }

    public void setName() {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge() {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSolary() {
        this.solary = solary;
    }

    public int getSolary() {
        return solary;
    }

    public static   Employee getRichEmp(List<Employee> emp) {
        Employee result = emp.get(0);
        for (int i = 0; i < emp.size(); i++) {
            if (emp.get(i).getSolary() > result.getSolary()) {
                result = emp.get(i);
            }
        }
        return  result ;
    }

    public static int  getBigSolar(List<Employee> empl){
        int sum= 0;
        for (int i = 0; i <empl.size() ; i++) {
            sum+=  empl.get(i).getSolary();
        }
        return  sum ;
    }

    public int compareTo(Employee empl){
        return (this.age - empl.age);
    }
}
