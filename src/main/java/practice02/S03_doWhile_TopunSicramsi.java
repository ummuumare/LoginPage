package practice02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class S03_doWhile_TopunSicramsi {
    public static void main(String[] args) {
         /*
        Bir top belirli yükseklikten atılmaktadır.(Scanner ile yüksekliği al)
        Atıldıktan sonra, atıldığı yüksekliğin 3/4 ü kadar yerden yukarı doğru zıplamaktadır.
        Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
        Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.
    */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz ");
        double yukseklik = input.nextDouble();
        double toplamYol = 0;
        int yereVurmaSayisi = 0;

          if (yukseklik > 1){

              do {
                  yereVurmaSayisi++;

                  toplamYol+=yukseklik ;//toplamYol = toplamYol +yukseklik;//

                  yukseklik*=0.75;//yukseklik = yukseklik*0.75;

                  toplamYol+=yukseklik;

              }while (yukseklik>1);

              toplamYol+=yukseklik;
              yereVurmaSayisi++;
          }

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("yereVurmaSayisi = " + yereVurmaSayisi);
        System.out.println("toplamYol = " +df.format(toplamYol) );

    }
}
