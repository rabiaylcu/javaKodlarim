import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Account account1 = new Account("rabia", 100);
        Account account2 = new Account("bugra", -5.17);

        account1.displayInfo();
        account2.displayInfo();

        Scanner input = new Scanner(System.in);

        System.out.println("enter deposit amount for acc1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to acc1 balance %n%n", depositAmount);
        account1.deposit(depositAmount);

        account1.displayInfo();
        account2.displayInfo();

        System.out.printf("%nenter deposit amount for acc2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to acc1 balance %n%n", depositAmount);
        account2.deposit(depositAmount);

        account1.displayInfo();
        account2.displayInfo();

    }
}