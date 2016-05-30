package hw.hwBasic4Hw3;

/**
 * Created by User on 30.05.2016.
 */
public class Player implements Recodable, Playable {


    @Override
    public void play() {
        System.out.println("Play");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }

    @Override
    public void record() {
        System.out.println("Record");
    }

    @Override
    public void pause() {
        System.out.println("Pause");
    }
}
