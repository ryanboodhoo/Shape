package shapeProject;

public class ShapeProject {

    public static void main(String[] args) {

        Shape circle = new Circle(7);
        circle.printArea();
        circle.printPerimeter();

        Rectangle rectangle = new Rectangle();
        rectangle.length = 10;
        rectangle.width = 10;
        rectangle.printArea();


        Rectangle rectangle2 = new Rectangle();
        rectangle2.length = 10;
        rectangle2.width = 10;
        rectangle2.printPerimeter();
    }
}
