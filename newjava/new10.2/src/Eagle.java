public class Eagle extends Animal implements Flyable{

    public Eagle(String name){
        super(name);
    }

    public void fly(){
        System.out.println("Eagle flying...");
    }

}
