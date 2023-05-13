package Switch;

public class Switch03 {

    public static void main(String[] args) {

         /*
        Verilen ay numaralarından başlayarak tüm ay adlarını yazdıran bir kod yazınız.
Örnek: Ay numarası 9 ise konsolda kodunuz Eylül Ekim Kasım Aralık olacaktır.
         */
    int  ay=8;
        for (int i = 1; i <= 12; i++) {

            switch (ay) {
                case 1:
                    System.out.println("Ocak ");

                case 2:
                    System.out.println("Şubat ");

                case 3:
                    System.out.println("Mart ");

                case 4:
                    System.out.println("Nisan ");

                case 5:
                    System.out.print("Mayıs ");

                case 6:
                    System.out.print("Haziran ");

                case 7:
                    System.out.print("Temmuz ");

                case 8:
                    System.out.print("Ağustos ");

                case 9:
                    System.out.print("Eylül ");

                case 10:
                    System.out.print("Ekim ");

                case 11:
                    System.out.print("Kasım ");

                case 12:
                    System.out.print("Aralık ");
                    break;


            }
        }
    }
}
