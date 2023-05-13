public class Switch08 {

    public static void main(String[] args) {

        /*
         Switch ifadesini kullanarak, mili km'ye, saniyeyi saate, fahrenhaytı santigrata çeviren bir
dönüştürücü oluşturmak için kod yazınız. Google'dan dönüşümler için formülleri bulunuz.
a) Kullanıcı mile değerini 10 ve operatorü mildenKmye olarak girdiğinde, konsolda kodunuz "16 km" yazmalıdır (sayı dinamik olacak)
b) Kullanıcı saniye değerini 7200 ve operatorü saniyedenSaate olarak girdiğinde, konsolda
kodunuz "2" yazmalıdır (sayı dinamik olacak)
c) Kullanıcı fahrenheit değerini 83 ve operatorü fahrenaytdanSantigarata olarak girdiğinde, konsolda kodunuz "28.3333 santigrat" yazmalıdır (sayı dinamik olacak)
d) Kullanıcı mildenKmye, saniyedenSaate, fahrenaytdanSantigarata ‘dan farklı bir işlem girdiğinde, kodunuz "Bu operatör, o dönüştürücü için tanımlanmadı" yazmalıdır.
         */

        double mil = 10;
        double saniye = 7200;
        double fahrenayt= 83;
        String operator = " fahrenaytdanSantigarata ";
        switch(operator){
            case "mildenKmye":
                System.out.println(mil*1.60934);
                break;
            case "saniyedenSaate":
                System.out.println((saniye/60)/60);
                break;
            case " fahrenaytdanSantigarata":
                System.out.println((fahrenayt-32)*5/9);
                break;
            default:
                System.out.println("Bu operator, o donusturucu icin tanimlanmadi");
        }
    }
}
