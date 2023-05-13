package DataTime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DT06 {

    public static void main(String[] args) {
        /*
 6) Kendinizin ve çocuğunuzun doğum tarihi için Tarih Değerleri oluşturup, ardından farkı gün
olarak hesaplayınız.
     */
        LocalDate dogumTarihim= LocalDate.of(1999,5,28);
        LocalDate cocugum=LocalDate.of(2028,5,11);
        long fark= ChronoUnit.DAYS.between(dogumTarihim,cocugum);
        System.out.println(fark);

    }
}
