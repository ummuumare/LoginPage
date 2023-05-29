package randomQuestion;

import java.util.Scanner;

public class Dikdortgen {
    public static void main(String[] args) {/*
        Soru: Kullanıcıdan üç adet sayı alarak, bu sayıların bir dik üçgenin kenar uzunlukları olup olmadığını kontrol eden bir program yazmanız istenmektedir.
        Bir üçgenin dik üçgen olduğunu anlamak için Pisagor bağlantısından yararlanabilirsiniz. Pisagor bağlantısı, bir üçgenin dik üçgen olduğunu belirlemek için kullanılan bir formüldür ve a^2 + b^2 = c^2 şeklinde ifade edilir. Burada a, b ve c üçgenin kenar uzunluklarını temsil eder.
                İşte programınızın gereksinimleri:
        Kullanıcıya üç adet sayı girmesi istenmelidir, bu sayılar üçgenin kenar uzunluklarını temsil eder.
        Girilen her sayı negatif veya sıfır olamaz. Eğer kullanıcı negatif veya sıfır bir değer girerse, hata mesajı gösterilmeli ve tekrar geçerli bir değer girmesi istenmelidir.
                Girilen kenar uzunluklarıyla bir dik üçgen oluşturulup oluşturulmadığı kontrol edilmelidir. Eğer oluşturulabiliyorsa, kullanıcıya "Girilen kenar uzunlukları bir dik üçgenin kenar uzunluklarına uyar." şeklinde bir mesaj gösterilmelidir. Dik üçgen değilse, kullanıcıya "Girilen kenar uzunlukları bir dik üçgenin kenar uzunluklarına uymaz." şeklinde bir mesaj gösterilmelidir.
        Programınızı bu gereksinimlere uygun olarak yazınız*/

        Scanner input = new Scanner(System.in);
        System.out.println( "Lutfen 3 adet rakam giriniz");
        int bir = input.nextInt();
        int iki = input.nextInt();
        int uc = input.nextInt();
        if (bir >0 && iki >0 && uc >0){
            if (bir * bir + iki * iki == uc * uc){
                System.out.println("Ucgenin kenar uzunluklaridir ");
            }else {
                System.out.println("Ucgenin kenar uzunluklari degildir..");
            }
        }else {
            System.out.println("Lutfen sifirdan buyuk bir rakam giriniz..");

        }









    }


}
