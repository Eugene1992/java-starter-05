package hw.hwBasic3Hw2;

/**
 * Created by User on 21.05.2016.
 */
public class GoodPupil extends Pupil {
    @Override
    public void study() {
        super.study();
        System.out.println("Wery well");
    }

    @Override
    public void read() {
        super.read();
        String myread="Read everyday";
    }

    @Override
    public void write() {
        super.write();
        String mywrite="Iwrite a book";
    }

    @Override
    public void relax() {
        super.relax();
        String myrelax="I don't have a time";
    }
}
