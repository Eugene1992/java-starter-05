package interfaces;

import interfaces.with.Employee;
import interfaces.with.EmployeeCRUD;
import interfaces.with.EmployeeCRUDlistImpl;
import java.util.Scanner;

public class Test {

    private static EmployeeCRUD employeeCRUD = new EmployeeCRUDlistImpl();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Choose command:\n1)get\n2)getAll\n3)add\n4)set\n5)remove");
            String command = scanner.next();
            if (command.equals("exit")) break;
            switch (command){

                case "1":
                    System.out.println("Enter employee id");
                    int id = scanner.nextInt();
                    System.out.println(employeeCRUD.get(id) + "\n");
                    break;

                case "2":
                    for (Employee employee : employeeCRUD.getAll()){
                        System.out.println(employee);
                    }
                    System.out.println();
                    break;

                case "3":
                    System.out.println("Enter employee name:");
                    String empName = scanner.next();
                    System.out.println("Enter employee salary:");
                    int empSalary = scanner.nextInt();
                    employeeCRUD.add(new Employee(empName, empSalary));
                    break;

                case "4":
                    System.out.println("Enter employee id:");
                    int empId = scanner.nextInt();
                    System.out.println("Enter employee name:");
                    String empName1 = scanner.next();
                    System.out.println("Enter employee salary:");
                    int empSalary2 = scanner.nextInt();
                    employeeCRUD.set(empId, new Employee(empId, empName1, empSalary2));
                    break;

                case "5":
                    System.out.println("Enter employee id:");
                    int empId1 = scanner.nextInt();
                    employeeCRUD.remove(empId1);
                    break;
            }
        }
    }
}
