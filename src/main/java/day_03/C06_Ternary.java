package day_03;

import java.util.Scanner;

public class C06_Ternary {
    public static void main(String[] args) {
       //kullanıcıdan bir sayı alınız
    //verılen sayının 3 veya daha cok bsmklı olup olmadıgını  ternary ile kontrol eden
    // ve yazdıran bir method olusturun
        Scanner input = new Scanner(System.in);
        System.out.println("Please give a number..");
        int num = input.nextInt();
      //main method icinden method olustururken;
        //methodismi +(argument)==>uzerine gelip create diyoruzz
        basamakSayisi(num);//(parantez icindeki bilgiye argument) denir
    }
    public static void basamakSayisi(int num) //(parantez icindeki yazi parametre) denir
    {
        System.out.println(num > 99 ? "uc veya daha cok basamakli" : "ucten az basamakli");

    }

}
