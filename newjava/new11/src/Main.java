import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BankAccount a1 = new BankAccount(1, "rabis", 1000);
        BankAccount a2 = new BankAccount(2, "bugra", 1500);
        BankAccount a3 = new BankAccount(3, "sena", 2000);
        BankAccount a4 = new BankAccount(4, "feyza", 2500);

        List<BankAccount> myAccounts = new ArrayList<>();
        myAccounts.add(a1);
        myAccounts.add(a2);
        myAccounts.add(a3);
        myAccounts.add(a4);

        Collections.sort(myAccounts);

        for (BankAccount account : myAccounts){
            account.balanceChange(500);
            System.out.println("hesap no: "+ account.getAccountNo() + ", hesap sahibi: "+ account.getHolderName() + ", bakiye: "+ account.getBalance());
        }


    }
}