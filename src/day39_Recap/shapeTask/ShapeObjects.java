package day39_Recap.shapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Square square = new Square(4);

        Rectangle rectangle = new Rectangle(5, 6);

        Circle circle = new Circle(4);

        System.out.println(square);
        System.out.println(rectangle);
        System.out.println(circle);

        System.out.println("-------------");

        square.setSide(10);
        System.out.println(square);

//        circle.setRadius(-7.5);
//        System.out.println(circle);

        rectangle.setName("My Rectangle");
        rectangle.setWidth(4);
        rectangle.setLength(5);

        System.out.println(rectangle.getLength() + ", " +rectangle.getWidth()+ ", " + rectangle.getName());




    }


}
