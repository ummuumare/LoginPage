package practice05.inheritance;

public class Musteri {
    String musteriAdi;
    int musteriNo;
    double hesapBakiyesi;



    public Musteri(String musteriAdi, int musteriNo, double hesapBakiyesi) {
        this.musteriAdi = musteriAdi;
        this.musteriNo = musteriNo;
        this.hesapBakiyesi = hesapBakiyesi;
    }

    public void paraYatirma(double para){
        hesapBakiyesi = hesapBakiyesi+para;
        System.out.println("Hesabiniza " + para + "TL yatirilmistir.");
        System.out.println("Yeni hesap bakiyeniz " + hesapBakiyesi + "TL dir.");
    }

    public void paraCekme(double para){
        if (hesapBakiyesi>= para) {
            hesapBakiyesi -= para;
            System.out.println("Hesap Bakiyenizden " + para + " TL cekilmistir");
            System.out.println("Yeni hesap bakiyeniz " + hesapBakiyesi + "TL dir.");
        } else{
            System.out.println("Hesap bakiyeniz yeterli degildir");
            System.out.println("Yeni hesap bakiyeniz " + hesapBakiyesi + "TL dir.");
        }
    }


    @Override
    public String toString() {
        return  "\nMusteri Adi : " + musteriAdi +
                "\n\t Musteri No : " + musteriNo +
                "\n\tHesap Bakiyesi : " + hesapBakiyesi ;
    }
}
