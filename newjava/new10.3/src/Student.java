public abstract class Student {
    private int id;
    private float mid;
    private float fin;
    protected int numberOfConf;

    public Student(int id, float mid, float fin){
        this.id=id;
        this.mid=mid;
        this.fin=fin;
    }

    float computeTotalScore(){
        return 0;
    }

    float computeBaseScore(){
        return mid*0.4f+fin*0.6f;
    }

}
