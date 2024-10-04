public class CanonPro extends Printer implements Faxable, ColoredPrintable, Scannable{

    public void print(){
        System.out.println("Canon pro printing");
    }

    public void scan(){
        System.out.println("Canon pro scanning...");
    }

    public void fax(){
        System.out.println("Canon pro faxing...");
    }

    public void colorPrint(){
        System.out.println("Canon pro color printing...");
    }

}
