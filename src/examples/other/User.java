package other;

/**
 * Created by Евгений on 19.05.2016.
 */
class User extends Parent{
    private Relationships relationships = new Relationships();
    private static int staticField;
    private int nonNtaticField;

    public static void main(String[] args) {
        User.Relationships rel = new User().new Relationships();

        int d = rel.age;
        Role role = Role.ADMIN;
        switch (role){
            case ADMIN:
                break;
        }
    }

    protected class Relationships{
        public int age;
        void f(){
            System.out.println(nonNtaticField);
        }
    }

    public enum Role {
        ADMIN, USER
    }
}

class Admin extends User{

}

