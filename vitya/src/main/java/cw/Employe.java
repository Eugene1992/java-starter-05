package cw;

import java.util.Arrays;
import java.util.List;

public class Employe {
    private int age;
    private int salary;
    private String name;
    private static int emplyCount;

    public Employe(int age, int salary, String name) {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary() {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public static int getEmplyCount() {
        return emplyCount;
    }

    public void setEmplyCount() {
        this.emplyCount = emplyCount;
    }

    public static Employe getRich(List<Employe> emp) {
        Employe result = emp.get(0);
        for (int i = 0; i < emp.size(); i++) {
            if (result.getSalary() < emp.get(i).getSalary()) {
                result = emp.get(i);
            }
        }
        return result;
    }

    public static int getRichSum(List<Employe> summ){
        int sumResult = 0;
        for (int i = 0; i < summ.size(); i++) {
            sumResult = sumResult + summ.get(i).getSalary();
        }
        return sumResult;
    }

    public static void main(String[] args) {
        System.out.println(Employe.getRich(Arrays.asList(new Employe(27, 100000, "Vitya"), new Employe(18, 500000, "Ira"))).getName());
        System.out.println(Employe.getRichSum(Arrays.asList(new Employe(27, 100000, "Vitya"), new Employe(18, 500000, "Ira"))));
    }
}
