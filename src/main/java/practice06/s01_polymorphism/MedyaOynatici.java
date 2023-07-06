package practice06.s01_polymorphism;

public class MedyaOynatici {
    public static void main(String[] args) {
        Medya medya = new Medya("Ses Dosyasi.mp3");

        System.out.println(medya.getDosyaAdi());
       System.out.println(medya.toString());

        Medya medya1 = new Medya("Ses Dosyasi 2.mp3");
        System.out.println(medya1);
         medya.setDosyaAdi("Sitem.mp3");
       System.out.println("Medya "  + medya);

       SesDosyasi sd = new SesDosyasi("Yeni Dosya.mp3");
       sd.durdur();
       sd.oynat();
        VideoDosyasi vd = new VideoDosyasi("Yeni ikinci Dosya");
        vd.oynat();
        vd.durdur();
    }
}
