package Switch;

public class Switch05 {

    public static void main(String[] args) {

        /*

        Belirli bir yılın belirli bir ayındaki gün sayısını görüntülemek için bir kod yazınız.
Örnek: 2000 yılının Şubat ayında gün sayısı 29.
         */

        int yil = 2000;
        int ay = 2;

        int gunSayisi = 0;

        switch(ay){
            case 2:
                if(yil % 4 == 0 && yil % 100 != 0 || yil % 400 == 0){
                    gunSayisi = 29;
                } else {
                    gunSayisi = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                gunSayisi = 30;
                break;
            default:
                gunSayisi = 31;
        }

        System.out.println(yil + " yılının " + ay + ". ayında gün sayısı: " + gunSayisi);





    }
}
