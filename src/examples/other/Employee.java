package other;

public class Employee {
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        //if (this.age != employee.age) return false;

        if (name != null) return name.equals(employee.name);
        else return employee.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        if (name != null) result = name.hashCode();
        else result = 0;
        result = 31 * result + age;
        return result;
    }
}
