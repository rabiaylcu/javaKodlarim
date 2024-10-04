public class DiscountTicket extends StandardTicket{

    double discount;

    public DiscountTicket(int seatNumber, int number, double discount){
        super(seatNumber,number);
        this.discount=discount;
    }

    public void print(){
        System.out.println(seatNumber +" "+ price +" "+ number +" "+ discount);
    }

    public double computePrice(){
        return super.computePrice() - price*discount;
    }

}
