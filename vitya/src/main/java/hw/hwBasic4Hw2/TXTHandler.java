package hw.hwBasic4Hw2;

/**
 * Created by User on 30.05.2016.
 */
public class TXTHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("Open TXT file");
    }

    @Override
    void create() {
        System.out.println("Create TXT file");
    }

    @Override
    void change() {
        System.out.println("Change TXT file");
    }

    @Override
    void save() {
        System.out.println("Save TXT file");
    }
}
