package compares;

public class Rectangle {
    private int sideOne;
    private int sideTwo;

    public Rectangle(int sideOne, int sideTwo) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    public int getSideOne() {
        return sideOne;
    }

    public void setSideOne(int sideOne) {
        this.sideOne = sideOne;
    }

    public int getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(int sideTwo) {
        this.sideTwo = sideTwo;
    }

    public int getSquare() {
        return this.getSideOne() * this.getSideTwo();
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);

        //System.out.println(rectangle.getSquare());

        Rectangle square = new Rectangle(10, 5){
            @Override
            public int getSquare() {
                return this.getSideOne() * this.getSideOne();
            }
        };

        Rectangle square1 = new ChildRectangle(10, 5);

        System.out.println(square.getSquare());

        System.out.println(square1.getSquare());

        /*System.out.println(rectangle.getSquare());

        Rectangle secondRectangle = new Rectangle(15, 2);

        System.out.println(secondRectangle.getSquare());*/
    }
}
