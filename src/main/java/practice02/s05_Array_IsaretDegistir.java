package practice02;

import java.util.Arrays;
import java.util.Scanner;

public class s05_Array_IsaretDegistir {
    public static void main(String[] args) {
        /*
        Array içerisindeki elementlerin işaretlerini (+-) değiştiren bir kod yazınız.
        input :1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6
    *//*
    int [] sayilar = {1,2,-3,4,-5,-6};

        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] *= -1;
        }

        System.out.println(Arrays.toString(sayilar));
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ilk ve son isminizi giriniz.");
        String name = input.nextLine();
        System.out.println(name);
        String adIlkHarf = name.trim().toUpperCase().split(" ")[0].substring(0,1);
        String soyadIlkHarf = name.trim().toUpperCase().split(" ")[1].substring(0,1);
        System.out.println("adIlkHarf = " + adIlkHarf);
        System.out.println("soyadIlkHarf = " + soyadIlkHarf);
    }
    }


