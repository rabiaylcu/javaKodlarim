public class StatMaker {

    static void Process(Gamer gamer1, Gamer gamer2){
        if (gamer1.sign == null || gamer2.sign == null || Arena.isGameOver) return;
        else if(gamer1.sign==HandSign.PAPER && gamer2.sign == HandSign.ROCK)
        {
            System.out.println(gamer1.name +" wins");
            gamer1.numberOfWins++;
        }
        else if(gamer1.sign==HandSign.SCISSOR && gamer2.sign == HandSign.PAPER)
        {
            System.out.println(gamer1.name +" wins");
            gamer1.numberOfWins++;
        }
        else if(gamer1.sign==HandSign.ROCK && gamer2.sign == HandSign.SCISSOR)
        {
            System.out.println(gamer1.name +" wins");
            gamer1.numberOfWins++;
        }
        else if(gamer1.sign == gamer2.sign)
        {
            System.out.println("draws!");
            Gamer.numberOfDraws++;
        }
        else
        {
            System.out.println(gamer2.name +" wins");
            gamer2.numberOfWins++;
        }

        Gamer.numberOfTrials++;
    }

    static void DisplayScores(Gamer gamer1, Gamer gamer2) {


    }

    static void Stats(Gamer gamer1, Gamer gamer2){
        if (Gamer.numberOfTrials==0) return;
        float g1Success = (float)gamer1.numberOfWins /(float)Gamer.numberOfTrials *100f;
        float g2Success = (float)gamer2.numberOfWins /(float)Gamer.numberOfTrials *100f;
        float drawsRate = (float)Gamer.numberOfDraws /(float)Gamer.numberOfTrials *100f;

        System.out.println("----------------SCOREBOARD--------------");
        System.out.println(gamer1.name +" success rate: "+g1Success);
        System.out.println(gamer2.name +" success rate: "+g2Success);
        System.out.println("draws rate: " + drawsRate);

        System.out.println("Trials: " +Gamer.numberOfTrials);
    }

}

