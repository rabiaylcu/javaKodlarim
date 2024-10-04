public abstract class Employee {

    protected String fName;
    protected String lName;
    protected int ssn;

    public Employee(String f, String l, int ssn){
        this.fName=f;
        this.lName=l;
        this.ssn=ssn;
    }
    protected abstract double earning();

    @Override
    public String toString() {
        return "first name: " +fName+ " last name: " +lName+ " ssn: " +ssn;
    }
}
