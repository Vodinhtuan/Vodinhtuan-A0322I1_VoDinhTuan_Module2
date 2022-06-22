package ss07_abstract_class_interface.bai_tap.bt01Resizeable;

public class TestBT01 {
    public static void main(String[] args) {
        Circle circle = new Circle(17,"Blue",true);
        Rectangle rectangle = new Rectangle(9,17,"Blue",true);
        Square square = new Square(17,"Blue",true);
        System.out.println( "Before change: \n" + circle + "\n" + rectangle + "\n" + square);
        System.out.println("Circle: "+circle.getArea());
        System.out.println("Square"+square.getArea());
        System.out.println("Rectangle: "+rectangle.getArea());
        circle.resize(50);
        square.resize(50);
        rectangle.resize(50);
        System.out.println("Circle: "+circle.getArea());
        System.out.println("Square"+square.getArea());
        System.out.println("Rectangle: "+rectangle.getArea());
    }
}
