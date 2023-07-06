package practice02;

import java.util.Scanner;

public class Tekrar01 {
    public static void main(String[] args) {
        String[] gunler = {"Pazartesi", "Salı", "Carsamba", "Persembe", "Cuma", "Cumartesi", "Pazar"};

        double gkazanc[] = new double[7];

        Scanner scan = new Scanner(System.in);

        double i = 0;


        while (i < 7) {

            System.out.println(gunler[(int) i] + " gününün kazancini giriniz.");

            double kazanc = scan.nextDouble();

            gkazanc[(int) i] = kazanc;

            i++;
        }

        double ortalama = hesaplaOrtalama(gkazanc);
        System.out.println("Ortalama Kazanc : " + ortalama);

    }

    public static double hesaplaOrtalama(double[] gkazanc) {
        double toplam = 0;
        for (double kazanc : gkazanc) {
            toplam += kazanc;
        }
        return (double) toplam / gkazanc.length;

    }

    public static double OrtalamaUstundekiKazancGunleri() {
        for (int i = 0; i < 7; i++) {


        }
        return 0;
    }

}
