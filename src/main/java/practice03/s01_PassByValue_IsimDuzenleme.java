package practice03;
public class s01_PassByValue_IsimDuzenleme {
    /*
       String içinde verilmiş bir ismin orjinal değerini değiştirmeden aşağıdaki işlemleri yapan metotlar yazın.
           String isim = "Ali Veli Can";
           - Tüm harleri büyük yapın.
           - Tüm harfleri küçük yapın.
           - İsmin başına ünvan ekleyin.
           - Sadece ilk isim ve soyismi yazın ve orta ismi kısaltarak yazın (Örnek: Ali V. Can)
           - İsmin sadece ilk harflerini büyük, soyismin tamamını büyük harfle yazın.
   */
    public static void main(String[] args) {
        String isim = "Ali Veli Can";

        String isim1 = "Ahmet Mehmet Bulut";

        String unvan = "Dr";
        System.out.println(isim);
        tumuBuyuk(isim);
        System.out.println(isim);
        tumuKucuk(isim);
        unvan(unvan, isim);

        kisaltma(isim);
        kisaltma(isim1);
       ilkBuyukDigerleriKucuk(isim);
       ilkBuyukDigerleriKucuk(isim1);

    }
    public static void tumuBuyuk(String deger) {
        deger = deger.toUpperCase();
        System.out.println(deger);
    }
    public static void tumuKucuk(String deger) {
        deger = deger.toLowerCase();
        System.out.println(deger);
    }
    public static void unvan(String unvan, String deger) {

      System.out.println(unvan + " " + deger);
    }
    public static void kisaltma(String deger){

      String str;
        str = deger.split(" ")[0];
        char str1;
        str1 = deger.split(" ")[1].charAt(0);
        String str2;
        str2 = deger.split(" ")[2];

        System.out.println(str +" "+ str1 + ". "+ str2);
    /*
       String[] parcala = deger.split(" ");
       String IlkIsim = parcala[0];
       IlkIsim = IlkIsim.substring(0,1).toUpperCase() + IlkIsim.substring(1);

       String ikinciIsim = parcala[1];
       ikinciIsim = ikinciIsim.substring(0,1).toUpperCase()+ " .";

       String son = parcala[2];
       son = son.substring(0,1).toUpperCase()+son.substring(1);

       deger = IlkIsim + " " + ikinciIsim + " " + son;

        */
    }
    //  - İsmin sadece ilk harflerini büyük, soyismin tamamını büyük harfle yazın.
    public static void ilkBuyukDigerleriKucuk(String deger) {
        char deger1 = deger.split(" ")[0].toUpperCase().charAt(0);

        char deger2 = deger.split(" ")[1].toUpperCase().charAt(0);

        String deger3 = deger.split(" ")[2].toUpperCase();

        System.out.println(deger1 + " . " + deger2 + " . " + deger3);

    }

}