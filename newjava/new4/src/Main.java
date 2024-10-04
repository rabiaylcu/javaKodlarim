
public class Main {
    public static void main(String[] args) {

     try{

         Time1 t1 = new Time1(24,67,56);
         System.out.println(t1.printTime());
     }

     catch(Exception e){
         System.out.println(e.getMessage());
     }

    }
}