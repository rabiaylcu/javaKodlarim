public class Circle {

    private static double PI= 3.141519;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double computeArea(){
        return PI*radius*radius;
    }

    public double getRadius() {
        return radius;
    }
}
