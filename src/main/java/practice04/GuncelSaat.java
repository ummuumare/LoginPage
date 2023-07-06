package practice04;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class GuncelSaat {
    public static void main(String[] args) throws InterruptedException {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");//nanoyu silmek icin boyle yazdik
        while (true){

            LocalTime simdikiSaat = LocalTime.now();

            System.out.print("\r" + dtf.format(simdikiSaat));
            /*
            Java programlama dilinde "\r" karakter dizisi, bir metin içindeki yer tutma karakteridir. Bu karakter, bir metin satırını başa sarar ve aynı satır üzerine yazmayı sağlar.
"\r" karakteri, bir metin akışında kullanıldığında, imleci o satırın başına getirir ve ardından gelen karakterlerin üzerine yazılmasını sağlar.
Bu genellikle bir metin düzenlemesi veya animasyon oluşturulması gibi durumlarda kullanılır.
             */

            Thread.sleep(1000);
        }
    }
}
