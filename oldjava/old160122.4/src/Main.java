import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        Circle c1 = new Circle(5,"black");
        Circle c2 = new Circle(10,"red");
        Circle c3 = new Circle(15,"blue");

        List Circles = new LinkedList();

        Circles.add(c1);
        Circles.add(c2);
        Circles.add(c3);

        Collections.sort(Circles, new areaComp());
        ListIterator iter = Circles.listIterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }


    }
}