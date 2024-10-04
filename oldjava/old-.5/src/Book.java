public class Book implements Comparable<Book>{

    String name;
    double price;
    public Book(String name, double price){
        this.name=name;
        this.price=price;
    }

    public double totalPrice(){
        return price+(8*price)/100;
    }

    public String toString(){
        return "name:" +name+ " price:"+(int)totalPrice();
    }

    public int compareTo(Book o){
        return (int)(this.totalPrice()-o.totalPrice());
    }

}
