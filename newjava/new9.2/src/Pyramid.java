public class Pyramid extends Shape3D {

    public Pyramid(int depth, int height, int width){
        super(depth, height, width);
    }

    public double getVolume(){
        return (double)1/3*super.getVolume();
    }

    public double getArea(){
        return 0;
    }


}
