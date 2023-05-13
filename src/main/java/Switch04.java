public class Switch04 {

    public static void main(String[] args) {

        /*
        Cinsiyet "Erkek" ise "Erkek" yazdırınız.
Cinsiyet "Kadın" ise "Kız" yazdırınız.
Cinsiyet "Erkek" ve "Kadın"dan farklıysa "Diğerleri" yazdırınız.
Not : Bu seçenekler dışındakilerini yoksayınız.
         */

        String cins = "Kadın";

        switch(cins){
            case "Erkek":
                System.out.println("Erkek");
                break;
            case "Kadın":
                System.out.println("Kız");
                break;
            default:
                System.out.println("Diğerleri");
        }



    }
}
