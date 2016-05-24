package interfaces.with;

import java.util.ArrayList;
import java.util.List;

public class EmployeeCRUDlistImpl implements EmployeeCRUD{

    private static List<Employee> employees = new ArrayList<>();

    static {
        employees.add(new Employee("Mike", 10000));
        employees.add(new Employee("Tom", 20000));
        employees.add(new Employee("Carlos", 15000));
        employees.add(new Employee("Orson", 25000));
    }

    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public Employee get(int id) {
        return employees.get(id);
    }

    @Override
    public List<Employee> getAll() {
        return employees;
    }

    @Override
    public void set(int id, Employee employee) {
        employees.set(id, employee);
    }

    @Override
    public void remove(int id) {
        employees.remove(id);
    }
}
