public class SeniorDeveloper extends RegularDeveloper implements PromotionBehaviour{

    @Override
    public double getPromotion() {
        return 1.5*monthlySalary;
    }

    double income(){
        return super.income()+getPromotion();
    }

    SeniorDeveloper(int id, String fullName, double monthlySalary){
        super(id,fullName,monthlySalary);
    }

}
