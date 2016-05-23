package hw.hw02;

/**
 * Created by YANA on 23.05.2016.
 */
public class Author {
    private String auth;
    public String getAuth(){return auth;}

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public void show(){
        System.out.println("Author " + auth);
    }
}
