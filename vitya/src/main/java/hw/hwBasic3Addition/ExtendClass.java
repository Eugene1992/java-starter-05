package hw.hwBasic3Addition;

/**
 * Created by User on 21.05.2016.
 */
public class ExtendClass extends Printer {
    public ExtendClass() {
        color = "New Color";
    }

    public void Print() {
        System.out.println(color);
        System.out.println((char) 27 + "[31m" + colorNext + (char) 27 + "[0m");
    }
}
