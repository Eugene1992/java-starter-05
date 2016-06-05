package other;

public class ObjectTest {
    int i;
    String s;



    public static void main(String[] args) {
        Employee e1 = new Employee();

        Employee e2;

        e2 = null;

        System.out.println(e1.equals(e2));
    }

    @Override
    public String toString(){
        return "{" + i + " " + s + "}";
    }
}
