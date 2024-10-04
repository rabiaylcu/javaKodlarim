public class Account {

    String name;
    double balance;
    public Account (String name, double balance){
        this.name=name;
        if(balance>0.0)
            this.balance=balance;
    }

    public void deposit(double depositAmount){
        if(depositAmount>0.0)
            balance=balance+depositAmount;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo(){
        System.out.printf("%s balance: $%.2f%n", name, balance);
    }


}


