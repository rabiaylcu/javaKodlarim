public class PhDStudent extends Student implements ArticleScoreBehaviour{

    private int numberOfArticles;

    public PhDStudent(int id,float mid,float fin,int numberOfConf, int numberOfArticles){
        super(id,mid,fin);
        this.numberOfConf=numberOfConf;
        this.numberOfArticles=numberOfArticles;
    }

    public float computeTotalScore(){
        return super.computeTotalScore()+articleScore();
    }

    public float articleScore(){
        return numberOfArticles*8;
    }

    public int getNumberOfConf() {
        return numberOfConf;
    }

    public void setNumberOfConf(int numberOfConf) {
        this.numberOfConf = numberOfConf;
    }

}
