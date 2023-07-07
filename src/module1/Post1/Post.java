package Post1;
import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
public class Post {
    private Date moment;
    private String title;
    private String content;
    private Integer likes;
    private static SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private List<Comment> comments = new ArrayList<>();

    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public void comment(Comment value){
        this.comments.add(value);
    }

    public void post(){
        System.out.println(this.title);

        System.out.println(this.likes + " Likes - " + fmt.format(this.moment));
        System.out.println(this.content);
        System.out.println("Comments");
        for(Comment array: comments){
            System.out.println(array.getText());
        }
    }

}
