package day_03;

import java.util.Scanner;

public class C01_Substring {
    public static void main(String[] args) {
         /*
    Kullanıcıdan ad ve soyadını aralarında bir bosluk olacak sekılde sisteme girmesini isteyiniz
    NOT: Yalnızca bir ad bir soyad girilmeli
    Ad ve Soyadı ilk harfleri buyuk olacak sekılde alt alta yazdırın
    Ad : Canan
    Soyad : Can
     */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter ur name and surname wth a space btw them ");
        String name = input.nextLine();
        char ilk = name.split(" ")[0].toUpperCase().charAt(0);
        String full1 = name.split(" ")[0].substring(1).toLowerCase();
        char son = name.split(" ")[1].toUpperCase().charAt(0);
        String full2 = name.split(" ")[1].substring(1).toLowerCase();
        //  int full = ilk +\n  son
        System.out.println(" " + ilk + full1 + "\n " + son + full2) ;
    }

    }
    /*
     public static void adSoyad(String name, String surname) {

         char ch = name.toUpperCase().charAt(0);
         char ch1 = surname.toUpperCase().charAt(0);
         System.out.println("ch"+ "\n ch1");
     } }
      /*
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ad ve soy adinizi aralarinda bir bosluk olacak sekilde giriniz..");
        String adSoyad =input.nextLine();//next methodu sadece space e kadar olan kismi alir
         //space index bulurum
        //0 dan space e kadar olan kismi substring ile alirim
        int spaceIndex = adSoyad.trim().indexOf(" ");
        //substring methodunun 2 formu var(Stringlerde index 0 dan baslar)
        //1.substring(index)==>yazilan index den string in sonuna kadar olan kismi string olarak dondurur
        //deniz ==> substring (3)==>iz
        //2.substring(index1, index2)==>index1 dahil , index2 haric olmak uzere index1 den index2 ye
        //kadar olan kisim string olarak doner
        //deniz==>substring(2,4)==>ni olur
        String ad = adSoyad.trim().substring(0,spaceIndex);//ad kismini alip space alinmayacak
        String soyad =adSoyad.trim().substring(spaceIndex+1);//spaceIndex+1==>space i hesaba katmadan soy ismin ilk harfini alsin diye
        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
        char adIlkHarf =ad.toUpperCase().charAt(0);
        String adKalan =ad.substring(1).toLowerCase();
        ad=adIlkHarf+adKalan;//concatenation==>ilk harf buyuk gerisi kucuk oldu
       char soyadIlkHarf = soyad.toUpperCase().charAt(0);
       String soyadKalan = soyad.substring(1).toLowerCase();
       soyad=soyadIlkHarf+soyadKalan;
        System.out.println("----------------------------");
        System.out.println("Ad = "  + ad);
        System.out.println("Soyad = " + soyad);
*/