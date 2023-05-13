package DataTime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DT12 {

    public static void main(String[] args) {
        /*
 2) Japonya saat dilimi ile Almanya saat dilimi arasındaki saat farkını bulmak için kodu yazınız

  */
        LocalTime saatJaponya = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        LocalTime saatAlmanya = LocalTime.now(ZoneId.of("Europe/Berlin"));

        System.out.println(saatAlmanya.getHour() - saatJaponya.getHour());
        long fark = ChronoUnit.HOURS.between(saatAlmanya,saatJaponya);
        System.out.println(fark);


    }
}
