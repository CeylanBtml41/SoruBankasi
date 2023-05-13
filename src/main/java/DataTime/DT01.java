package DataTime;

import java.time.LocalDate;
import java.time.Period;

public class DT01 {


    public static void main(String[] args) {
        /*
          1)   Ali'nin kaç gün yaşadığını bulan kodu yazınız.
        Ali'nin doğum tarihi 12 Mayıs 2002'dir.
     */
        LocalDate aliDogumTarihi = LocalDate.of(2002, 5, 9);
        LocalDate mycorrenct = LocalDate.now();

        Period yasadigiGun = Period.between(aliDogumTarihi, mycorrenct);
        System.out.println(yasadigiGun);
    }
}
