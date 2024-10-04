public abstract class Developer {

    String fullName;
    int id;

    abstract double income();
    Developer(int id, String fullName){
        this.id=id;
        this.fullName=fullName;
    }

}
