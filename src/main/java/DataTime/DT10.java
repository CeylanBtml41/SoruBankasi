package DataTime;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DT10 {

    public static void main(String[] args) {
        /*
  10) İki farklı tarih için saat farkını bulunuz.
     */

        LocalDateTime tarihsaat = LocalDateTime.of(1999, 5, 28, 22, 38);
        LocalDateTime tarihsaat2 = LocalDateTime.of(2023, 5, 9, 1, 5);
        long fark = ChronoUnit.HOURS.between(tarihsaat, tarihsaat2);
        System.out.println(fark);
    }
}
