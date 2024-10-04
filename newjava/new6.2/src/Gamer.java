import java.util.Random;
import java.util.Scanner;

public class Gamer {

    String name;
    HandSign sign;
    int numberOfWins;
    static int numberOfDraws;
    static int numberOfTrials;
    Random random = new Random();

    Gamer (String name){
        this.name=name;
    }

    void move(){

        Scanner input = new Scanner(System.in);
        System.out.println("Please press (s) for Scissor, (p) for Paper, (r) for Rock, (q) for Quit.");
        System.out.println(this.name +"'s turn");
        boolean isInputValid = true;

        do{
            char inChar = input.next().charAt(0);

            switch(inChar){
                case 'q':
                    Arena.isGameOver= true;
                    break;
                case 'p':
                    sign = HandSign.PAPER;
                    break;
                case 'r':
                    sign = HandSign.ROCK;
                    break;
                case 's':
                    sign = HandSign.SCISSOR;
                    break;
                default:
                    System.out.println("Please enter corret input");
                    isInputValid=false;
                    break;
            }

        }while(!isInputValid);
    }

    void AutoMove(){
        int randomDecision = random.nextInt(3);

        if (randomDecision == 0) sign=HandSign.PAPER;
        if (randomDecision == 1) sign=HandSign.ROCK;
        else sign=HandSign.SCISSOR;

        System.out.println(sign);
    }

}
