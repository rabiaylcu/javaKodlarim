
public class Main {
    public static void main(String[] args) {

        Patient patient1 = new Patient("p1");
        Patient patient2 = new Patient("p2");
        Patient patient3 = new Patient("p3");
        Patient patient4 = new Patient("p4");

        Patient[] patients = {patient1, patient2, patient3, patient4};

        for (Patient patient:patients){
            System.out.println(patient.toString());
        }

    }
}