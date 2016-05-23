package hw.hw04.hw42;

/*Используя IntelliJ IDEA, создайте проект.Требуется:
Создайте 2 интерфейса Playable и Recodable. В каждом из интерфейсов создайте по 3 метода void play() / void pause()
 / void stop() и void record() / void pause() / void stop() соответственно.
Создайте производный класс Player от базовых интерфейсов Playable и Recodable.
Написать программу, которая выполняет проигрывание и запись.
*/
public class  Player implements Playable, Recodable {
   // @Override
    public void play() {
    }
    //@Override
    public void pause() {
    }
    //@Override
    public void record() {
    }
    //@Override
    public void stop() {
    }


    public static void main(String[] args) {
        Player player = new Player() ;

        player.play();
        player.pause();
        player.record();
        player.stop();
    }
}
