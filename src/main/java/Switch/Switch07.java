package Switch;

import java.util.Scanner;

public class Switch07 {

    public static void main(String[] args) {


        /*

        Switch ifadesini kullanarak, herhangi bir 2 sayıyla toplama, çıkarma, çarpma ve bölme
yapan basit bir hesap makinesi oluşturmak için kod yazınız.
a) Kullanıcı 10.2 ve 5 ve + işaretini girdiğinde kodunuz konsolda "Sonuç 15.2" yazmalıdır.
b) Kullanıcı 10 ve 5 ve - işaretini girdiğinde kodunuz konsolda "Sonuç 5.0" yazmalıdır.
c) Kullanıcı 10 ve 5.3 ve * işaretini girdiğinde kodunuz konsolda "Sonuç 53.0" yazmalıdır.
d) Kullanıcı 10 ve -5 ve / işaretini girdiğinde kodunuz konsolda "Sonuç -2.0" yazmalıdır.
e) Kullanıcı 10 ve -5 girdiğinde +, -, *, / 'den farklı bir işlem yaptığında kodunuz "Geçersiz İşlem" yazmalıdır.


         */

        Scanner input = new Scanner(System.in);
        double sayi1, sayi2, sonuc;
        char islem;

        System.out.print("İşlem yapmak istediğiniz iki sayıyı ve işlemi girin: ");
        sayi1 = input.nextDouble();
        sayi2 = input.nextDouble();
        islem = input.next().charAt(0);

        switch (islem) {
            case '+':
                sonuc = sayi1 + sayi2;
                System.out.println("Sonuç " + sonuc);
                break;
            case '-':
                sonuc = sayi1 - sayi2;
                System.out.println("Sonuç " + sonuc);
                break;
            case '*':
                sonuc = sayi1 * sayi2;
                System.out.println("Sonuç " + sonuc);
                break;
            case '/':
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                    System.out.println("Sonuç " + sonuc);
                } else {
                    System.out.println("Geçersiz işlem");
                }
                break;
            default:
                System.out.println("Geçersiz işlem");
                break;
        }
    }
}
