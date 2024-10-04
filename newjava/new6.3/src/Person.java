public class Person {

    int id;
    String firstName;
    String lastName;
    int age;

    public Person (int id, String firstName, String lastName, int age){
        this.id= id;
        this.firstName= firstName;
        this.lastName= lastName;
        this.age= age;
    }

    public Person(String firstName, String lastName){
        id= generateId();
        this.firstName= firstName;
        this.lastName= lastName;
        age=0;
    }

    public Person(int id){
        this.id= id;
        firstName= "DefaultFirstName";
        lastName= "DefaultLastName";
        age=0;
    }

    public Person(){
        id=generateId();
        firstName= "DefaultFirstName";
        lastName= "DefaultLastName";
        age=0;
    }

    private static int currentId = 0;

    private static int generateId(){
        return ++currentId;
    }

}
