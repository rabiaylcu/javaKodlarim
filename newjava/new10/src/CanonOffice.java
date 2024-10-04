public class CanonOffice extends Printer implements Faxable, Scannable{

    public void print(){
        System.out.println("Office printing...");
    }

    public void fax(){
        System.out.println("Office faxing...");
    }

    public void scan(){
        System.out.println("Office scanning...");
    }

}
