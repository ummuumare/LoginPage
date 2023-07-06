package practice06.s02_oop_project;

public abstract class  Hayvan {//pojo class/ evebeyn ollmak zorunda
   private String ad;
   private int yas;
    private String tur;

    public Hayvan(String ad, int yas, String tur) {
        this.ad = ad;
        this.yas = yas;
        this.tur = tur;

    }

    public abstract void yemekYer();//burada abstract yaptikk
    public abstract void sesCikar();//bu method da da abstract yapip body i sildik

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }
}
