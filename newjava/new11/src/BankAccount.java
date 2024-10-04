public class BankAccount implements Comparable<BankAccount>{

    private int accountNo;
    private String holderName;
    private double balance;

    public BankAccount(int accountNo, String holderName, double balance){
        this.accountNo=accountNo;
        this.holderName=holderName;
        this.balance=balance;
    }

    public void balanceChange(double amount){
        balance=balance-amount;
    }

    public int getAccountNo(){
        return accountNo;
    }

    public String getHolderName(){
        return holderName;
    }

    public double getBalance(){
        return balance;
    }

    public int compareTo(BankAccount other){
        return this.holderName.compareTo(other.holderName);
    }

}
