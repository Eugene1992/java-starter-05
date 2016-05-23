package compares;

/**
 * Created by Евгений on 23.05.2016.
 */
public class ChildRectangle extends Rectangle{
    public ChildRectangle(int sideOne, int sideTwo) {
        super(sideOne, sideTwo);
    }

    @Override
    public int getSquare() {
        return this.getSideOne() * this.getSideOne();
    }
}
