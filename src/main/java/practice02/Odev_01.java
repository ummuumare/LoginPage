package practice02;

import java.util.Scanner;

public class Odev_01 {
    public static void main(String[] args) {
          /*
        Amaç:
        Oyuncudan 1 ile 100 arasında bir sayı tahmini alarak rastgele bir sayıyı bulmaya çalışması istenir.
        Oyuncuya her tahminde doğru sayıya yaklaşıp yaklaşmadığına dair ipuçları verilir ve oyuncuya 10 tahmin hakkı tanınır.

        Yönergeler:
        - Oyuncuya "1-100 arası bir sayı tahmini giriniz" mesajı gösterilir.
        - Oyuncu bir sayı girişi yapar.
        - Oyuncunun tahmini, rastgele seçilen sayıya göre kontrol edilir:
            - Tahmin doğru ise, "Tebrikler, X. tahminde sayıyı buldunuz!" mesajı gösterilir.
              Ardından oyuncunun puanı hesaplanır ve "Puanınız: X" mesajı gösterilir ve
              "Tekrar oynamak için 1'e, çıkmak için herhangi bir sayıya basın." mesajı gösterilir.
            - Tahmin, sayıdan küçük ise, "Bilemediniz, tahmin için X hakkınız kaldı! Daha büyük bir sayı giriniz:" mesajı gösterilir.
            - Tahmin, sayıdan büyük ise, "Bilemediniz, tahmin için X hakkınız kaldı! Daha küçük bir sayı giriniz:" mesajı gösterilir.
            - Oyuncuya 10 tahmin hakkı verilir. Oyuncu 10 tahmin hakkını da kullanırsa,
              "Hakkınız bitti, oyunu kaybettiniz. Tekrar oynamak için 1'e, çıkmak için herhangi bir sayıya basın."
              mesajı gösterilir.
            - Oyuncu 1'e basarsa, oyun yeniden başlatılır ve yeni bir rastgele sayı seçilir.
            - Oyuncu herhangi bir sayıya basarsa, oyun sona erer ve program sonlanır.
     */

        int sayi = 53;
        Scanner input = new Scanner(System.in);
        boolean result = false;
        int counter = 1;
        do {
            if (counter == 10) {
                System.out.println("Hakkınız bitti, oyunu kaybettiniz");
                System.out.println("Tekrar oynamak için 1'e, çıkmak için herhangi bir sayıya basın.");
                int giris2 = input.nextInt();
                if (giris2 != 1) {
                    break;
                }else{
                    counter=1;
                }
            }
            System.out.println("1 ile 100 arasında bir sayı giriniz:");
            int tahmin = input.nextInt();

            if (tahmin < sayi) {
                System.out.println("Bilemediniz, tahmin için " +(10- counter) + " hakkınız kaldı! Daha büyük bir sayı girmelisiiz:");
            } else if (tahmin > sayi) {
                System.out.println("Bilemediniz, tahmin için " +(10 - counter) + " hakkınız kaldı! Daha küçük bir sayı girmelisiniz:");
            } else {
                System.out.println("Tebrikler " + counter + ". tahminde sayıyı buldunuz!");
                System.out.println("Puaniniz=" + counter * 100);
                System.out.println("Tekrar oynamak için 1'e, çıkmak için herhangi bir sayıya basın.");
                int giris = input.nextInt();
                if (giris != 1) {
                    break;
                }else {
                    counter=0;
                }
            }
            counter++;

        } while (true);

    }
}



