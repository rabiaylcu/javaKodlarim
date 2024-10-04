public class Arena {

    Gamer gamer1;
    Gamer gamer2;
    public static boolean isGameOver;

    void addGamers(Gamer gamer1, Gamer gamer2){
        this.gamer1=gamer1;
        this.gamer2=gamer2;
    }

    void StartGame(){
        while(Gamer.numberOfTrials<10){
            gamer1.AutoMove();
            gamer2.AutoMove();
            StatMaker.Process(gamer1, gamer2);
            //GameManager.DisplayScores(gamer1,gamer2);
        }
    }


}
