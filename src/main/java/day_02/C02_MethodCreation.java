package day_02;

import java.util.Scanner;

public class C02_MethodCreation {
    //kullanicidan Fahrenheit cinsi bir deger girmesini isteyin
    // Fahrenheit değeri, Celsius değere çeviren method yazınız.
    // formül: c = (f-32)/1.8
    //yani fahrenheit degerini bu methoda gonderdıgımde bana celsius cinsinden sıcaklık donmeli

    public static void main(String[] args) {

      //kullanicidan veri almak icin 1-> scanner objesi olustur

        Scanner  scan = new Scanner(System.in);
        System.out.println("Lutfen fahrenheit cinsi bir sicaklik girjn");//kullaniciya bir mesaj gonderelim
             double fahrenheit = scan.nextDouble();

        System.out.println("fahrenheit = " + fahrenheit);

        //main methodun icinden method olusturuken ne yapiyoruz
        //ilk once methodumuza verecegimiz ismi yaziyoruz
        //method parantezinin icine argument yaziyoruz
            double celsius = fahrToCels(fahrenheit);//method parantezinin icine neyi degistireceksek onu yazariz
        System.out.println("celsius = " + celsius);

    }
    public static double fahrToCels(double fahrenheit) {
        //formül: c = (f-32)/1.8
        double celsius=(fahrenheit-32)/1.8;
         return celsius;//return(fahrenheit-32)/1.8; seklinde de olabilir
    }


}
