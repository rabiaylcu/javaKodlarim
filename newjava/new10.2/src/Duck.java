public class Duck extends Animal implements Swimmable, Flyable, Moveable{

    public Duck(String name){
        super(name);
    }

    public void swim(){
        System.out.println("Duck swimming...");
    }

    public void fly(){
        System.out.println("Duck flying...");
    }

    public void move(){
        System.out.println("Duck moving...");
    }


}
