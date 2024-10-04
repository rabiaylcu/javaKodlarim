
public class Main {
    public static void main(String[] args) {

        CanonOffice p = new CanonOffice();

        if(p instanceof Scannable){
            p.scan();
        }

    }
}