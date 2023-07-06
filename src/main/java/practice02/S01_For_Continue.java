package practice02;

import java.util.Scanner;

public class S01_For_Continue {
    public static void main(String[] args) {

         /*
      Kullanıcıdan 5 adet sayı isteyiniz
      Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
    */
        Scanner input = new Scanner(System.in);


        int toplama = 0;
        for (int i = 1; i < 6; i++) {
            System.out.println(i + " sayiyi girniz");
            int sayilar = input.nextInt();
            toplama = 0;
            if (sayilar > 5 && sayilar < 10) {
                System.out.println("Girdigniz sayi 5 ile 10 arasinda oldugu icin toplama islemine dahil edilmemistir.");
                continue;
            }
            toplama = toplama + sayilar;//toplam+=sayi seklinde de olabilir daha kisa bir yol
        }
        System.out.println("toplam sayi : " + toplama);
    }
}
