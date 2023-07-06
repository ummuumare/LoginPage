package practice06.s02_oop_project;

public class Ziyaretciler {
   private String ad;
     private int yas;
     private String cinsiyet;
    private String ziyaretTarihi;

    public Ziyaretciler(String ad, int yas, String cinsiyet, String ziyaretTarihi) {
        this.ad = ad;
        this.yas = yas;
        this.cinsiyet = cinsiyet;
        this.ziyaretTarihi = ziyaretTarihi;
    }

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

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getZiyaretTarihi() {
        return ziyaretTarihi;
    }

    public void setZiyaretTarihi(String ziyaretTarihi) {
        this.ziyaretTarihi = ziyaretTarihi;
    }

    @Override
    public String toString() {
        return "Ziyaretciler{" +
                "ad='" + ad + '\'' +
                ", yas=" + yas +
                ", cinsiyet='" + cinsiyet + '\'' +
                ", ziyaretTarihi='" + ziyaretTarihi + '\'' +
                '}';
    }
}
