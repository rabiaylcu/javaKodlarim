public class Cat extends Animal implements Swimmable, Moveable{

    public Cat(String name){
        super(name);
    }

    public void swim() {
        System.out.println("Cat swimming...");
    }

    public void move(){
        System.out.println("Cat moving...");
    }
}
