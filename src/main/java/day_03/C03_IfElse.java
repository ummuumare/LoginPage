package day_03;

import java.util.Scanner;

public class C03_IfElse {
    public static void main(String[] args) {
        //kullanıcıdan iki sayı isteyin
        //sayıların ikisi de pozitifse sayıların toplamını yazdırın
        //ikisi de negatifse sayıların çarpımını yazdırın
        //ikisi farklı işaretlere sahipse farklı işaretlerde sayılarla işlem yapamazsın yazdirin
        //sayılardan sıfıra eşit olan varsa sıfır çarpmaya göre yutan elamandır yazdırın
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen iki rakam giriniz");
        int num1 =input.nextInt();
        int num2 =input.nextInt();
        if (num1 > 0 && num2 > 0){
            System.out.println(num1+num2);
        }else if (num1 < 0 && num2 < 0){
            System.out.println(num1*num2);
        }else if ((num1>0 && num2<0) ||(num1>0 &&num2<0) ){//sayi1*sayi2<0 de olur
                                                          //(sayi1<0&&sayi2>0)||(sayi1>0&&sayi2<0) de olur
            System.out.println("farklı işaretlerde sayılarla işlem yapamazsın");
        }else{
            System.out.println("Sayilardan sifira esit olan varsa sifir carpmaya gore yutan elemandir");



        }
    }
}
