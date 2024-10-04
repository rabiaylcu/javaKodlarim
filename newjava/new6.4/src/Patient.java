public class Patient {

    private static int patientCounter=0;

    private int patientId;
    private String name;

    Patient(String name){
        this.name= name;
        this.patientId= ++patientCounter;
    }

    public String getName() {
        return name;
    }

    public int getPatientId() {
        return patientId;
    }

    @Override
    public String toString() {
        return "Patient ID: " + patientId + ", Name: " + name;
    }
}
