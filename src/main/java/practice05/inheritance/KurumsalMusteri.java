package practice05.inheritance;

public class KurumsalMusteri extends Musteri {
    String vergiNumarasi;
    String sirketAdi;
    public KurumsalMusteri(String musteriAdi, int musteriNo, double hesapBakiyesi) {
        super(musteriAdi, musteriNo, hesapBakiyesi);
    }

    @Override
    public String toString() {
        return "Kurumsal Musteri " +
                super.toString() +
                "\n\t Vergi Numarasi :" + vergiNumarasi +
                "\n\t Sirket Adi :" + sirketAdi ;
    }
}
