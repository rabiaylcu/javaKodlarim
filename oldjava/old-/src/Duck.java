public class Duck extends Animal implements Swimmable, Flyable{

    public void Swim() {
        System.out.println("duck swims");
    }

    public void Fly(){
        System.out.println("duck flies");
    }

    public void move(){
        System.out.println("duck is moving");
    }


}
