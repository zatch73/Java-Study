package UseDate;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Test2 {
    public static void main(String[] args) {
        LocalDate data1 = LocalDate.parse("2022-07-20");

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("d1, usando o método do objeto: "+data1.format(formato));
        System.out.println("d1, passando o objeto para formato: "+formato.format(data1));

        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());

        Instant dataGlobal = Instant.now();

        System.out.println("DATA: " + formato2.format(dataGlobal));


    }
}
