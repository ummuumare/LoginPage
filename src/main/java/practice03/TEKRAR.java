package practice03;

public class TEKRAR {
    public static void main(String[] args) {
        /*
        İki farklı method oluşturun.
          - İlk method, bir ürün adını ve fiyatını parametre olarak alacak ve bu bilgileri ekrana yazdıracak.
          - İkinci method bir ürün adı, fiyatı ve indirim oranı parametrelerini alacak ve indirimli fiyatı ekrana yazdıracak.
        Bu methodları kullanarak farklı ürünleri ve indirim oranlarını ekrana yazdırın.
           */

            String[] urunIsimleri = {"Kalem", "Defter", "Silgi", "Cetvel"};

            double[] urunFiyatlari = {10.99, 12.49, 8.99, 15.99};

        urunFiyatListesi("");



    }

    public static void urunIndirimFiyat(String str) {
    }

    public static void urunFiyatListesi(String str){
        String kalem = "Kalem : 10.99";
        String defter= "defter : 10.99";
        String silgi = "silgi: 10.99";
        String cetvel = "cetvel : 10.99";
        System.out.println(kalem+" "+ defter+ " " +silgi+ " " + cetvel);

    }

}
