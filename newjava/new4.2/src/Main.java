import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try{
            System.out.println("lütfen tamsayi giriniz: ");
            int sayi = input.nextInt();
            System.out.println("girilen tamsayi: "+sayi);
        } catch(InputMismatchException e){
            System.out.println("lütfen bir tamsayi giriniz!");
        } finally {
            System.out.println("done");
        }




    }
}