package practice04;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Scanner;

public class S01_DateTime_Gunler {
      /*
        Kullanıcıdan alınan bir tarihin haftanın hangi gününe denk geldiğini bulan bir program yazmanız isteniyor.
        Kullanıcıdan yıl, ay ve gün bilgilerini alarak, tarihin hangi gün olduğunu bulan bir Java programı yazın.
        Sonuç olarak, tarihin haftanın hangi gününe denk geldiğini Türkçe olarak ekrana yazdırın.
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yil ,ay, ve gun bilgilerini giriniz");

        int yil = input.nextInt();
        int ay = input.nextInt();
        int gun = input.nextInt();
        LocalDate verilenTarih = LocalDate.of(yil,ay,gun);
        String haftaninGunu = verilenTarih.getDayOfWeek().name();
        System.out.println(haftaninGunu);

        switch (haftaninGunu){
            case "MONDAY":
                System.out.println("Girdiginiz tarih Pazartesi gunune denk gelmektedir.");
                break;
            case "TUESDAY":
                System.out.println("Girdiginiz tarih Pazartesi gunune denk gelmektedir.");
                break;
            case "WEDNESDAY":
                System.out.println("Girdiginiz tarih Pazartesi gunune denk gelmektedir.");
                break;
            case "THURSDAY":
                System.out.println("Girdiginiz tarih Pazartesi gunune denk gelmektedir.");
                break;
            case "FRIDAY":
                System.out.println("Girdiginiz tarih Pazartesi gunune denk gelmektedir.");
                break;
            case "SATURDAY":
                System.out.println("Girdiginiz tarih Pazartesi gunune denk gelmektedir.");
                break;
            case "SUNDAY":
                System.out.println("Girdiginiz tarih Pazartesi gunune denk gelmektedir.");
                break;
        }
        // 2. YOL
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(new Locale("tr"));
       // System.out.println("Girilen tarih: " + tarih.format(formatter).split(" ")[3]);
    }



    }


