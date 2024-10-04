public abstract class Ticket {

    public int number;
    int seatNumber;
    public Ticket(int seatNumber, int number){
        this.seatNumber=seatNumber;
        this.number=number;
    }

    public abstract void print();
    public abstract double computePrice();



}
