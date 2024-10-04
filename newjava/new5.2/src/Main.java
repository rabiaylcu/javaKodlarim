
public class Main {
    public static void main(String[] args) {

        Circle circle1= new Circle(5);
        Circle circle2= new Circle(10);
        Circle circle3= new Circle(15);

        Circle[] circles = {circle1, circle2, circle3};

        for (Circle circle : circles){
            System.out.println("Circle with radius " + circle.getRadius() + " has area: " + circle.computeArea());
        }

    }
}