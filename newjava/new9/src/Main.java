
public class Main {
    public static void main(String[] args) {

        Employee e1=new SalariedEmployee("a", "b", 211, 100);
        Employee e2= new HourlyEmployee("c","d",210, 10,40);
        Employee e3= new CommisionEmployee("e","f",209, 1000, 0.1f);
        Employee e4= new BasePlusCommissionEmployee("c","d",208, 1000, 0.1f, 100);

        Employee[] emps = {e1,e2,e3,e4};

        for (Employee e: emps){
            System.out.println(e + " " +e.earning());
        }

    }
}