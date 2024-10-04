import java.util.Date;

public class Document {

    private String[] authors;
    private String name;
    Date date;

    public String[] getAuthors() {
        return authors;
    }

    public void addAuthor(String name){
        this.name= name;
    }

    public Date getDate() {
        return date;
    }
}
