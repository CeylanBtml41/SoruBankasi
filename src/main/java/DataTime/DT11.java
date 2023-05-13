package DataTime;

import java.time.LocalTime;

public class DT11 {

    public static void main(String[] args) {
        /*
        Eğer saat
i) 24:00 ile 05:00 arasında ise konsola 'Uyku zamanı' yazdırınız.
ii) 08:00 ile 16:00 arasında ise konsola 'Çalışma zamanı' yazdırınız.
iii) 19:00 ile 22:00 arasında ise konsola 'Aile zamanı' yazdırınız.
iv) Diğerleri için konsolda 'Kişisel zaman' yazdırınız
         */
        LocalTime saat = LocalTime.of(22, 51, 23);
        if (saat.getHour() > 0 && saat.getHour() < 5) {
            System.out.println("Uyku zamanı");
        } else if (saat.getHour() > 8 && saat.getHour() < 16) {
            System.out.println("Çalışma zamanı");
        } else if (saat.getHour() > 19 && saat.getHour() < 22) {
            System.out.println("Aile zamanı");
        } else System.out.println("Kişisel zaman");

    }
}
