package DataTime;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DT13 {
    public static void main(String[] args) {
        /*
        Ali 5 Şubat 2015 TRT 10:00'da İstanbul' da, Mark 5 Şubat 2015 12:00 EST' de ABD' de
doğmuştur. Ali'nin doğum saati ile Mark'ın doğum saati arasındaki saat cinsinden fark
nedir?
         */

        LocalDateTime ali=LocalDateTime.of(2015,2,5,10,0);
        LocalDateTime mark=LocalDateTime.of(2015,2,5,10,0);

        ZonedDateTime alidogum=ali.atZone(ZoneId.of("Europe/Istanbul"));
        ZonedDateTime markdogum=mark.atZone(ZoneId.of("America/New_York"));
        long fark= ChronoUnit.HOURS.between(alidogum,markdogum);
        System.out.println(fark);

        LocalDateTime ali1 = LocalDateTime.of(2015 , 2 , 5 , 10 , 0 , 0);
        ZonedDateTime aliTarih = ali1.atZone(ZoneId.of("Europe/Istanbul"));
        LocalDateTime mark1 = LocalDateTime.of(2015 , 2 , 5 , 12 , 0 , 0);
        ZonedDateTime markTarih = mark1.atZone(ZoneId.of("America/New_York"));
        long fark1 = ChronoUnit.HOURS.between(ali1 , mark1);
        System.out.println(fark1);







    }
}