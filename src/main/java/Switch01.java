public class Switch01 {

    public static void main(String[] args) {


      /*
          Yazdırmak için switch ifadesini kullanınız.
      a) Aralık, Ocak, Şubat için "Kış"
      b) Mart, Nisan, Mayıs için "Bahar"
      c) Haziran, Temmuz, Ağustos için "Yaz"
      d) Eylül, Ekim, Kasım için "Güz"
      e) Diğerleri için "Geçersiz ay adı"

       */


        String ayAdi = "mayis";
        ayAdi = ayAdi.toLowerCase();
        switch (ayAdi) {
            case "aralik":
            case "ocak":
            case "subat":
                System.out.println("Kis");
                break;
            case "mart":
            case "nisan":
            case "mayis":
                System.out.println("Bahar");
                break;
            case "haziran":
            case "temmuz":
            case "agustos":
                System.out.println("Yaz");
                break;
            case "eylul":
            case "ekim":
            case "kasim":
                System.out.println("Guz");
                break;
            default:
                System.out.println("Gecersiz ay adi");
                break;


        }
    }
}
