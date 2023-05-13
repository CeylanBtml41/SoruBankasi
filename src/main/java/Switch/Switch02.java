package Switch;

public class Switch02 {

    public static void main(String[] args) {

        /*
        Ayın numarasını girdiğinizde ayın adını yazdırmak için bir switch ifadesi kullanınız.
Örneğin;
kullanıcı 1 girerse kodunuz "Ocak" yazmalıdır,
kullanıcı 2 girerse kodunuz "Şubat" yazmalıdır vb.
Kullanıcı geçersiz ay numarası girerse kodunuz "Geçersiz numara" yazmalıdır.
         */

        int ayNo = 11;
        String ayIsim;
        switch (ayNo) {
            case 1: ayIsim = "Ocak";
                break;
            case 2: ayIsim = "Subat";
                break;
            case 3: ayIsim = "Mart";
                break;
            case 4: ayIsim = "Nisan";
                break;
            case 5: ayIsim = "Mayis";
                break;
            case 6: ayIsim = "Haziran";
                break;
            case 7: ayIsim = "Temmuz";
                break;
            case 8: ayIsim = "Agustos";
                break;
            case 9: ayIsim = "Eylul";
                break;
            case 10: ayIsim = "Ekim";
                break;
            case 11: ayIsim = "Kasim";
                break;
            case 12: ayIsim = "Aralik";
                break;
            default: ayIsim = " Gecersiz numara ";
                break;
        }
        System.out.println(ayIsim);
    }
}
