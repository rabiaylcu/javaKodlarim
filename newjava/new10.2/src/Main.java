
public class Main {
    public static void main(String[] args) {

        Animal duck = new Duck("duffy duck");
        Animal cat = new Cat("thomas");
        Animal eagle = new Eagle("black eagle");

        Animal[] animals = {duck, cat, eagle};

        for(Animal a: animals){
            if(a instanceof Flyable){
                ((Flyable) a).fly();
            }
        }
    }
}