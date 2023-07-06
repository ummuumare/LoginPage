package practice04;

import java.util.Scanner;
public class S05_StringBuilder_FaktoriyelHesaplama {
 /*
        Bir öğrenci, matematik dersinde, verilen bir sayının faktöriyelini hesaplamak için bir program yazmak istiyor.
        Program, kullanıcıdan bir sayı girmesini isteyecek ve faktöriyel hesaplama işlemini gerçekleştirecektir.
        Kullanıcının girdiği sayı 20'den küçük veya eşit olacaktır.
        Faktöriyel hesaplama işlemi tamamlandıktan sonra sonucu ekrana yazdıracaktır.
    */
 public static void main(String[] args) {
     //5! ==> 1*2*3*4*5 =120

     Scanner input = new Scanner(System.in);

     System.out.println("Lutfen bir sayi giriniz(20 den kucuk veya esit olsun): ");

     int sayi = input.nextInt();

     if (sayi <= 20){
         int carpim = 1;
       StringBuilder sonuc = new StringBuilder();
        sonuc.append(sayi).append("! = ");
         for (int i = 1; i <= sayi ; i++) {
             carpim*=i;
             sonuc.append(i);
             if (i !=sayi){
                 sonuc.append(" * ");
             }
         }
         sonuc.append(" = ").append(carpim);
         System.out.println(sonuc);
     }else{
         System.out.println("Gecersiz bir deger girdiniz sayiyi kurallarina gore yaziniz!!");
     }
 }



}
