package interfaces.with;

import java.util.List;

public interface EmployeeCRUD {
    void add(Employee employee); // create

    Employee get(int id); // read

    List<Employee> getAll(); // read

    void set(int id, Employee employee); // update

    void remove(int id); // delete
}
