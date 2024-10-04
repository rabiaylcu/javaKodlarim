public class Circle extends Shape2D{

    public Circle(double radius){
        super(radius);
    }

    public double getArea(){
        return PI*Math.pow(radius,2);
    }

}
