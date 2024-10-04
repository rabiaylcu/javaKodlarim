public class FreelanceDeveloper extends Developer implements BonusSalaryBehaviour{

    int unitPrice;
    int hours;

    @Override
    public double getBonusSalary() {
        return hours*1.5;
    }

    @Override
    double income() {
        return hours*unitPrice+getBonusSalary();
    }

    FreelanceDeveloper(int id, String fullName, int hours){
        super(id,fullName);
        this.hours=hours;
    }
}
