package hw.hwBasic3Hw2;

/**
 * Created by User on 21.05.2016.
 */
public class BadPupil extends Pupil {
    @Override
    public void read() {

        System.out.println("Nothing");
    }

    @Override
    public void relax() {

        String myrelax = "Every day";
    }

    @Override
    public void study() {

        String mystudy = "I don't want";
    }

    @Override
    public void write() {

        String mywrite = "I don't need that";
    }
}
