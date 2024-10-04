import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("name: ");
        String name = input.nextLine();

        System.out.println("midterm: ");
        float midtermExam = input.nextFloat();

        System.out.println("final: ");
        float finalExam = input.nextFloat();

        Student student1 = new Student(name, midtermExam, finalExam);
        student1.calculateScore();
        student1.showStudentInfoAndScore();



    }
}