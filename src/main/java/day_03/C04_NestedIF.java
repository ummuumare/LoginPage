package day_03;

import java.util.Scanner;

public class C04_NestedIF {
    public static void main(String[] args) {
            /*
        Kullanıcıdan sisteme bir numara girmesini isteyin.
        Eger numara sıfırdan küçükse, konsolda "Negatif Sayı" yazdırın.
        Degilse, 10'dan küçük olup olmadığına bakın. 10'dan küçükse konsola "Rakam" yazdırın,
        10'dan büyük veya eşitse konsola "Pozitif Sayı" yazdırın.
*/
        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen bir numara giriniz");
        int num = input.nextInt();

        if (num <0 ){
            System.out.println("Negatif sayi");
        }else {
         if (num<10){
             System.out.println("Rakam");
         }else {
             System.out.println("Pozitif sayi");
         }
        }
        //2.yol(kendim denedim dogrulandi)
        Scanner input1 = new Scanner(System.in);
        System.out.println("Lutfen bir numara giriniz..");
        int num1 = input1.nextInt();
        if (num1 > 0 ){
            if (num1<10){
                System.out.println("Rakam");
            }else if (num1>=10){
                System.out.println("Pozitif Sayi");
            }
        }else{
            System.out.println("Negatif Sayi");
        }

    }


}
