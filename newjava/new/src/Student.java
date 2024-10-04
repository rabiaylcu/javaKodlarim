public class Student {

    String name;
    float midtermExam;
    float finalExam;

    Student (String name, float midtermExam, float finalExam){
        this.name = name;
        this.midtermExam = midtermExam;
        this.finalExam = finalExam;
    }

    float calculateScore(){
        return midtermExam*0.4f+finalExam*0.6f;
    }
    void showStudentInfoAndScore(){
        System.out.println("name: " +name);
        System.out.println("midterm: " +midtermExam);
        System.out.println("final: " +finalExam);
        System.out.println("average: " +calculateScore());
    }


}
