public class Employee {

    String name;
    int socialSecurityNumber;
    float wage;
    int workingHours;

    Employee(String name, int socialSecurityNumber, float wage, int workingHours){
        this.name=name;
        this.socialSecurityNumber=socialSecurityNumber;
        this.wage=wage;
        this.workingHours=workingHours;
    }

    void displayInfo(){
        System.out.println("name: " +name);
        System.out.println("number: " +socialSecurityNumber);
    }

    void displaySalary(){
        System.out.println("salary: " +wage*workingHours);
    }




}
