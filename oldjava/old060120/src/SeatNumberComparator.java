import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SeatNumberComparator implements Comparator<Ticket> {

    public int compare(Ticket t1, Ticket t2){
        return t1.seatNumber-t2.seatNumber;
    }

    /*public void SortAndPrint(List<Ticket> tickets){
        SeatNumberComparator seatComp = new SeatNumberComparator();
        Collections.sort(tickets, seatComp);
        for (Ticket t : tickets){
            t.print();
        }
    }*/

}
