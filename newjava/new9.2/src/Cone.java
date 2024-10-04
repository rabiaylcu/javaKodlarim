public class Cone extends Shape3D{

    public Cone(double height, double radius){
        super(height, radius);
    }

    public double getVolume(){
        return (double)1/3*super.getVolume();
    }

    public double getArea(){
        return 0;
    }

}
