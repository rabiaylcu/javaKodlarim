import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Ticket t1 = new StandardTicket(10,1);
        Ticket t2 = new DiscountTicket(22,2,0.1);
        Ticket t3 = new DiscountTicket(12,3,0.2);
        Ticket t4 = new StandardTicket(35,4);

        List<Ticket> tickets = new ArrayList<>();
        tickets.add(t1);
        tickets.add(t2);
        tickets.add(t3);
        tickets.add(t4);

        SortAndPrint(tickets);

        TicketSeller ts = new TicketSeller(tickets);
        ts.Sell(t1);
        ts.Sell(t2);
        ts.Sell(t3);
        ts.Sell(t4);

        System.out.println(ts.getIncomes());

    }

    private static void SortAndPrint(List<Ticket> tickets) {

        SeatNumberComparator seatComp = new SeatNumberComparator();
        Collections.sort(tickets, seatComp);
        for (Ticket t : tickets){
            t.print();
        }

    }
}