
public class Main {
    public static void main(String[] args) {

        BachelourStudent student1 = new BachelourStudent(1, 20, 30);
        MasterStudent student2 = new MasterStudent(2, 50, 35, 5);
        PhDStudent student3 = new PhDStudent(3, 40, 60, 3, 5);

        System.out.println(student1.computeBaseScore());
        System.out.println(student2.computeBaseScore());
        System.out.println(student3.computeBaseScore());
        System.out.println(student1.computeTotalScore());
        System.out.println(student2.computeTotalScore());
        System.out.println(student3.computeTotalScore());
        System.out.println(student1.projectScore());
        System.out.println(student2.conferenceScore());
        System.out.println(student3.articleScore());


    }
}