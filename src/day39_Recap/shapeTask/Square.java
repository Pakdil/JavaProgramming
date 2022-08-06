package day39_Recap.shapeTask;

public class Square extends Shape {

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0) {
            System.err.println("Ivalid Side: " +side);
            System.exit(1);
        }
        this.side = side;
    }

    public Square(String name, double side) {
        super(name);
        this.side = side;
    }
}
