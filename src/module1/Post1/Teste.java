package Post1;

import java.time.LocalDate;
import java.util.Date;

public class Teste {
    public static void main(String[] args) {
        Post Jhon = new Post(new Date(), "About the jhon", "win of jhon", 12);
        Jhon.comment(new Comment("Good morning"));
        Jhon.comment(new Comment("Good morning"));
        Jhon.comment(new Comment("Good morning"));
        Jhon.comment(new Comment("Good morning"));
        Jhon.post();

        LocalDate data = LocalDate.now();
    }
}
