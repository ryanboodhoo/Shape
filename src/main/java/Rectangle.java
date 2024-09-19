public class Rectangle extends Shape{

    @Override
    public void printArea() {
        System.out.println(length * width);
    }

    @Override
    public void printPerimeter() {
        double perimeter = (length + width) * 2;
        System.out.println(perimeter);
    }
    //
}
