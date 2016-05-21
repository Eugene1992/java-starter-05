package hw.hwBasic3Addition;

/**
 * Created by User on 21.05.2016.
 */
public class Main {
    public static void main(String[] args) {
    ExtendClass extendClass=new ExtendClass();
        extendClass.Print();
        System.out.println((char) 27 + "[33m"+extendClass.color + (char)27 + "[0m");
        System.out.println((char) 27 + "[36m"+extendClass.color + (char)27 + "[0m");
        System.out.println((char) 27 + "[35m"+extendClass.colorNext + (char)27 + "[0m");
    }
}
