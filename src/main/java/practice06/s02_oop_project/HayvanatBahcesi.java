package practice06.s02_oop_project;

import java.util.ArrayList;
import java.util.List;

public class HayvanatBahcesi {
    private static List<Hayvan>hayvanlar = new ArrayList<>(); //hayvan yazarak (data type farkli icerdigi icin)butun hayvanlari kapsar
    private static List<Ziyaretciler>ziyaretciler = new ArrayList<>();

    public void hayvanEkle(Hayvan hayvan){
        hayvanlar.add(hayvan);
    }

    public void ziyaretciEkle (Ziyaretciler ziyaretci){

        ziyaretciler.add(ziyaretci);
    }

    public void hayvanListele(){
        System.out.println("HAYVANLAR LISTESI:");
        for (Hayvan hayvan :hayvanlar) {

            System.out.println("Ad: " +  hayvan.getAd() );
            System.out.println("Yas: " + hayvan.getYas());
            System.out.println("Tur: " + hayvan.getTur() );
            System.out.println("------------------------");
        }

    }


public  void hayvanTablola() {
    System.out.println("HAYVANLAR TABLOSU :");
    System.out.printf("%-10s %-10s %-10s %n" , "Ad", "Yas", "Tur");
    System.out.println("-----------------------------");
    for (Hayvan hayvan : hayvanlar) {
        System.out.printf("%-10s %-10s %-10s", hayvan.getAd(), hayvan.getYas(), hayvan.getTur());
    }
}
}