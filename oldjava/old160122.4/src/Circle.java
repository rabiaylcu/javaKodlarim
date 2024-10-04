public class Circle {

    final static double PI=3.14;
    double radius;
    String color;

    public Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }

    public double calculateArea(){
        return radius*radius*PI;
    }

    public String toString() {
        return "color: " +color+ ", radius: " +radius+ ", area: " +calculateArea();
    }

}
