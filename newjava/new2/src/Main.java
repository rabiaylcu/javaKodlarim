import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("name: ");
        String name = input.nextLine();

        System.out.println("number: ");
        int socialSecurityNumber = input.nextInt();

        System.out.println("wage: ");
        float wage = input.nextFloat();

        System.out.println("working hours: ");
        int workingHours = input.nextInt();

        Employee emp1 = new Employee(name, socialSecurityNumber, wage, workingHours);
        emp1.displayInfo();
        emp1.displaySalary();

        System.out.println("---");

        Employee emp2 = new Employee("rabia", 12, 244, 7);
        emp2.displayInfo();
        emp2.displaySalary();


    }
}