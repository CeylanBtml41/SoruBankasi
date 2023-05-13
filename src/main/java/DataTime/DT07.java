package DataTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DT07 {
    public static void main(String[] args) {
        /*
    7) Belirli bir tarihte yılın son 2 hanesini alınız.
     */

        DateTimeFormatter format= DateTimeFormatter.ofPattern("yy");
        String tarih =format.format(LocalDate.now());
        System.out.println(tarih);
    }
}
