public class Cylinder extends Shape3D{

    public Cylinder(double height,double radius){
        super(height, radius);
    }

    public double getVolume(){
        return super.getVolume();
    }

    public double getArea(){
        return super.getArea()*2+2*PI*radius*depth;
    }

}
