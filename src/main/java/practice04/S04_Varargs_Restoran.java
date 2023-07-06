package practice04;

public class S04_Varargs_Restoran {
    public static void main(String[] args) {
         /*
        Java programında, bir restoranın menüsündeki yemeklerin fiyatlarını hesaplayan bir metot yazmanız isteniyor.
        Metot, menüdeki yemeklerin isimlerini ve ardından fiyatlarını almalıdır.
        Menüdeki yemeklerin fiyatları toplamını döndüren ve menüye hiç yemek eklenmediğinde 0 döndüren bir metot yazın.
    */
         double toplam = toplamYemekFiyati("Corba", "12.34", "Salata","22.25","Pide", "36.45");

        System.out.println("toplam = " + toplam);
    }
    public static double toplamYemekFiyati(String...yemekler){
        double toplamFiyat = 0;
        System.out.println("... HARIKALAR DIYARI lokantasina hosgeldinizz...");
        System.out.println("-------------------------------------");
        for (int i = 0; i < yemekler.length; i+=2) {
            String yemek = yemekler[i];

          double yemekFiaytlari = Double.parseDouble(yemekler[i+1]);
          toplamFiyat+=yemekFiaytlari;
            System.out.println(yemek +  " = " + yemekFiaytlari + " TL");

        }
        System.out.println("---------------------------------------");
        return toplamFiyat ;
    }




}
