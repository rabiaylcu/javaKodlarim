
public class Main {
    public static void main(String[] args) {

        Cylinder cylinder=new Cylinder(5,1);
        Pyramid pyramid=new Pyramid(5,5,5);
        Circle circle=new Circle(3);
        Square square=new Square(5);

        System.out.println(pyramid.getArea());
        System.out.println(circle.getArea());
        System.out.println(square);

    }
}