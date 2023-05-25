package UseDate;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test1 {
    public static void main(String[] args) {
        // data local
        LocalDate date1 = LocalDate.now();
        LocalDateTime data2 = LocalDateTime.now();
        // data de londres

        Instant data3 = Instant.now();
        // converter data
        String day = "20";
        String month = "10";
        String year = "2021";
        LocalDate data4 = LocalDate.parse(year+"-"+month+"-"+day);

        LocalDate data5 = LocalDate.parse("15/07/2009", DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.println("Data1 = "+date1.toString());
        System.out.println("Data2 = "+data2.toString());
        System.out.println("Data3 = "+data3.toString());
        System.out.print("DATA IMPLEMENTADA: ");
        System.out.println("Data4 = "+data4.toString());
        System.out.println("data 5 = "+data5.toString());
    }
}
