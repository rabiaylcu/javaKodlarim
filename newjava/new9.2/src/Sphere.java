public class Sphere extends Shape3D{

    public Sphere(int depth, double radius){
        super(depth,radius);
    }

    public double getVolume(){
        return (double)4/3*PI*Math.pow(radius,3);
    }

    public double getArea(){
        return 4*super.getArea();
    }

}
