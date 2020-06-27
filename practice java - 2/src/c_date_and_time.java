import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class c_date_and_time {
    
    public static void main(String[] args) {
        Date x = new Date();
        DateFormat y = new SimpleDateFormat("dd/MM/YYYY");
        String z = y.format(x);
        System.out.println(z);
        
        LocalTime a = LocalTime.now();
        DateTimeFormatter b = DateTimeFormatter.ofPattern("hh:mm:ss");
        String c = a.format(b);
        System.out.println(c);
    }
}
