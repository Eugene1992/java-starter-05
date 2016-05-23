package compares;

public class Square {
    private int side1;
    private int side2;

    public Square(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }

    public void printSquare(){
        System.out.println(this.side1 * this.side2);
    }

    public static void main(String[] args) {
        Square square1 = new Square(10, 5);
        square1.printSquare();

        Square square2 = new Square(10, 5){
            @Override
            public void printSquare() {
                System.out.println(this.getSide1()*2);
            }
        };
        square2.printSquare();

        square1.printSquare();
    }
}
