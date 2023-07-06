package day_01;

public class C03_Ortalama {
     /*
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 100;

       Bu sayıların ortalamasını hesaplayan bir kod yazınız.
     */
     public static void main(String[] args) {
         double num1 = 23.4;
         double num2 = 24.0;
         double num3 = 12;
         double num4 = 450.3;
         double num5 = 100;

         // double data turunde ismi toplam olan bir variable olusturun
         //bu variable a yazdiginiz 5 sayinin toplamini assign edelim(atayalim)

         double toplam = num1 + num2 + num3 + num4+ num5; //sayisal(numerik) datalarda arti isareti toplama islemi yapar
         System.out.println("toplam = " + toplam);

         //ortalama  = toplam/ sayi adedi

         double ortalama = toplam/ 5;
         System.out.println("ortalama = " + ortalama);//121.94000000000001

     }
}
