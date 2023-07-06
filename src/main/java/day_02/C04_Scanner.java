package day_02;

import java.util.Scanner;

public class C04_Scanner {


    //Kullanicidan aldiginiz character ile asagidaki gibi bir gorunum olusturunuz

        /*
                  A
                 A A
                A A A
         */
/*------Benim yaptigim method ile------------------
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a character");
        char ch = input.next().charAt(0);
        ucgenGorunum(String.valueOf(ch));
    }

    public static void ucgenGorunum(String a) {
        System.out.println("  " + a + "\n " + a + " " + a + "\n"+a+ " " + a + " " + a);
    }*/


    public static void main(String[] args) {
        //kullanicidan bir veri almak icin Scanner kullanilir

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz..");

        char ch = input.next().charAt(0);//scanner objesinin nextChar diye bir methodu yok
        //bu yuzden kullanicinin girdigi datayi once string olarak aliyoruz
        //daha sonra bu stringin 0. indexindeki karakteri charArt(0) methodu ile aliyorum

        //String variablelarda index yapisi vardir ve index sifirdan baslar
        //charAt(0) ==> sifirinci index yani ilk karakter demektir.
        System.out.println("ch = " + ch);
        System.out.println("=============================CEVAP1========");
        /*
        A(
       A A
      A A A
         */
        //NOTE: konsolde bosluk(space) yapmak icin  sout'un icinde space i mutlaka ""icinde yazmaliyiz
        System.out.println("  " + ch + "  "); //1.satir
        System.out.println(" " + ch + " " + ch + " ");//2.satir
        System.out.println(ch + " " + ch + " " + ch);//3.satir
        System.out.println("===============================ikinci cevap yolu=========");
        //\n isareti bir alt satira gecmeye yarar ! ""icinde yazilir
        System.out.println("  " + ch + "\n " + ch + " " + ch + "\n" + ch + " " + ch + " " + ch);


    }
}









