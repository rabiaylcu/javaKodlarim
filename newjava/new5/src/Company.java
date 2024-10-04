public class Company {

    Employee employee= new Employee(2110205058, "rabia");
    CompanyName companyName= new CompanyName();

    public Company(Employee e, CompanyName c){
        this.employee=e;
        this.companyName=c;
    }

    public Employee getEmployee() {
        return employee;
    }

    public CompanyName getCompanyName() {
        return companyName;
    }
}
