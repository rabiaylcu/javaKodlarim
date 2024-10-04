import java.util.Comparator;

public class areaComp implements Comparator<Circle> {
    public int compare(Circle c1, Circle c2){
        return (int)(c1.calculateArea()-c2.calculateArea());
    }
}
