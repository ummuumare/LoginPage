package practice06.s01_polymorphism;

public class Medya {//(pojuClass bir nevi depo vazifesi herseyi yerlestirbeiliyor ebevyn class)
    private  String dosyaAdi ;


    public Medya(String dosyaAdi) {
        this.dosyaAdi = dosyaAdi;
        System.out.println("Bir obje olusturuldu.");
    }

    public void oynat(){
        System.out.println("Dosya oynatiliyor");

    }


    public void durdur(){
        System.out.println("Dosya durduruluyor");
    }


    public String getDosyaAdi() {
        return dosyaAdi;
    }

    public void setDosyaAdi(String dosyaAdi) {
        this.dosyaAdi = dosyaAdi;
    }

    @Override
    public String toString() {
        return " Dosya Adi\t = " + dosyaAdi ;
    }
}














