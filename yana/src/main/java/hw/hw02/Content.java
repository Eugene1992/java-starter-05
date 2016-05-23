package hw.hw02;

/**
 * Created by YANA on 23.05.2016.
 */
public class Content {
    public String cont;
    public String getCont(){return cont;}

    public void setCont(String cont) {
        this.cont = cont;
    }

    void show(){
        System.out.println("Content " + cont);
    }
}
