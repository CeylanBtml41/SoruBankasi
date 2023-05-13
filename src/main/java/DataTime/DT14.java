package DataTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DT14 {
    public static void main(String[] args) {
        /*
        Ali 5 Şubat 2015 saat 10:15 EST'de doğmuştur, Veli 6 Mart 2015 saat 12:25 EST'de
doğmuştur. Ali ve Veli'nin doğum süreleri arasındaki fark nedir?
         */
        LocalDateTime ali = LocalDateTime.of(2015,2,5,10,15);
        LocalDateTime veli = LocalDateTime.of(2015,4,6,12,25);
        long fark = ChronoUnit.MINUTES.between(ali,veli);
        System.out.println(fark);


    }
}
