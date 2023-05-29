package day_03;

import java.util.Scanner;

public class C02If {
    public static void main(String[] args) {
        // Kullanicidan ayri ayri sisteme iki sayi girmesini isteyiniz.
        // ilk sayinin ikinci sayidan buyuk olup olmadıgını yazdırın
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen birinci sayi giriniz..");
        int number1 =input.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz..");
        int number2 = input.nextInt();
        if (number1>number2){
            System.out.println("Birinci sayi  ikinci sayidan buyuktur");
        }else{
            System.out.println("Birnci sayi ikinci sayidan buyuk degildir");
        }

    }
}
