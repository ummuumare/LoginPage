package day_03;

import java.util.Scanner;

public class C05_IfElse {
    public static void main(String[] args) {
          /*
        Kullanıcıdan 3 karakterden daha uzun bir kelime sisteme girmesini isteyin
        Eger kelimenin karakter sayısı 3 ve 3'den daha kucuk ise konsola "
        3 Karakterden Daha Uzun Bir Kelime Girmelisiniz " yazdırınız
        Degilse kelimenin basına ve sonuna, kelimenin son uc harfini ekleyerek yazdırınız
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen uc karakterden daha uzun bir kelime giriniz..");
        String word =input.next();
        int uzunluk = word.length();
        String sonUc = word.substring(uzunluk-3);
        if (uzunluk < 4){
            System.out.println("Karakterden Daha Uzun Bir Kelime Girmelisiniz ");
        }else{
            //karnabahar in indexi ==>7, length ==> 10 dir. substring(length-3
            System.out.println(sonUc + word + sonUc);
        }


        //2.yol(ben denedim)
        Scanner input1=new Scanner(System.in);
        System.out.println("Lutfen 3 karakterden daha uzun bir kelime giriniz");
        String word1=input1.next();
        String lastThree = word1.substring(word1.length()-3);
        if (word1.length()<4){
            System.out.println("Lutfen 3 karakterden daha uzun bir kelime giriniz..");
        } else {
            System.out.println(lastThree+word1+lastThree);
        }


    }
}
