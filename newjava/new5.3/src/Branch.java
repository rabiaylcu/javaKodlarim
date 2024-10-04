public enum Branch {
    MATH("This is a math teacher"),
    PHYSICS("This is a physics teacher"),
    CS("This is a cs teacher"),
    ENG("This is a eng teacher");

    private String desc;
    private Branch(String desc){
        this.desc=desc;
    }

    public String getDesc(){
        return this.desc;
    }

}
