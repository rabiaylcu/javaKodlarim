
public class Main {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher(1,Branch.MATH);
        Teacher teacher2 = new Teacher(2,Branch.PHYSICS);
        Teacher teacher3 = new Teacher(3,Branch.CS);
        Teacher teacher4 = new Teacher(4,Branch.ENG);

        Teacher[] teachers = {teacher1, teacher2,teacher3, teacher4};

        for (Teacher teacher:teachers) {
            System.out.println(teacher.getBranch().getDesc());
        }

    }
}