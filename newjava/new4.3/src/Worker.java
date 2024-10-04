public class Worker {

    private String name;
    private double salary;
    private static int counter = 0;

    public Worker(String name, double salary){
        this.name=name;
        try{
            setSalary(salary);
            counter++;
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        if(salary<0){
            throw new IllegalArgumentException("Salary amount must be greater than zero!");
        }
        this.salary = salary;
    }

    public static int getTotalWorkers(){
        return counter;
    }
}
