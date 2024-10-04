import java.util.List;

public class TicketSeller {

    List<Ticket> tickets;
    private double incomes;

    public TicketSeller(List<Ticket>tickets){
        this.tickets=tickets;
    }

    public void Sell(Ticket ticket){
        incomes= incomes+ticket.computePrice();
        tickets.remove(ticket);
    }
    public double getIncomes(){
        return incomes;
    }

}
