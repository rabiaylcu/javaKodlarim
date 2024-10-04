
public class Main {
    public static void main(String[] args) {

        try{
            Worker worker = new Worker("rabia", -1000);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        Worker worker1 = new Worker("bugra", 5000.0);
        Worker worker2 = new Worker("merve", -6000.0);
        Worker worker3 = new Worker("emircan", 7000.0);

        System.out.println("Total number of workers: " + Worker.getTotalWorkers());

    }
}