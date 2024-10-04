public class MasterStudent extends Student implements ConferenceScoreBehaviour{

    int numberOfConf;
    public MasterStudent(int id,float mid,float fin,int numberOfConf){
        super(id,mid,fin);
        this.numberOfConf=numberOfConf;
    }
    float computeTotalScore(){
        return computeBaseScore()+conferenceScore();
    }
    public float conferenceScore(){
        return numberOfConf*5;
    }

}
