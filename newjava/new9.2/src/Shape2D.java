public abstract class Shape2D {

    final static double PI=3.14;
    double height;
    double radius;
    double width;

    public Shape2D(double height,double width){
        this.height=height;
        this.width=width;
        radius=0;
    }

    public Shape2D(double radius){
        this.radius=radius;
        height=0;
        width=0;
    }

    public double getArea(){
        return PI*Math.pow(radius,2)+height*width;
    }

    public String toString(){
        if(radius==0)
            return "Height of shape="+height+" Wide of shape="+width+" Area of shape="+getArea();
        return "Radius of shape="+radius+" Area of shape="+getArea();
    }
}
