package DataTime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DT02 {
    public static void main(String[] args) {
        /*
    2) Ali'nin kaç ay yaşadığını bulan kodu yazınız.
Ali'nin doğum tarihi 4 Haziran 1997'dir
     */


        LocalDate bugun =LocalDate.now();
        LocalDate ali=LocalDate.of(1997,6,4);
        long kacAy= ChronoUnit.MONTHS.between(ali,bugun);
        System.out.println(kacAy);
    }
}
