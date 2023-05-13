package DataTime;

import java.time.LocalDate;

public class DT09 {

    public static void main(String[] args) {
        /*
        İki farklı tarihin ay numaralarının toplamını bulunuz.

         */

        LocalDate t1= LocalDate.of(1999,5,28);
        LocalDate t2= LocalDate.of(1996,5,14);
        int a1=t1.getMonthValue();
        int a2=t2.getMonthValue();
        System.out.println(a1+a2);





    }
}
